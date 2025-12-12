package interf;

public class Dog implements Animal{

	// 100% achieve abstraction  
	// To support multiple inheritance
	@Override
	public void sound() {
		
		System.out.println("Dog baeks");
	}

}
