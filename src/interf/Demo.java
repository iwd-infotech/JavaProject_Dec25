package interf;

public class Demo implements A,B {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();
		d.show();

	}

	@Override
	public void display() {
		System.out.println("Display method");
		
	}

	@Override
	public void show() {
		System.out.println("Show method");
		
	}

}
