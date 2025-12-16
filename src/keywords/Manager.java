package keywords;

public class Manager extends Person{

	String name = "Manager Name";

	void show() {
		System.out.println(name);
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		Manager obj = new Manager();
		obj.show();
	}

}
