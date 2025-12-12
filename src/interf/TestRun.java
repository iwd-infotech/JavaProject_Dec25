package interf;

public class TestRun {

	public static void main(String[] args) {
//		Animal an = new Animal(); We can't create object of interface 

		Dog d = new Dog();
		d.sound();
		
		Animal a = new Dog();

	}

}
