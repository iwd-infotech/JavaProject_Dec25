package oops;

public class Static_And_NonStatic {

	public static void main(String[] args) {
		Static_And_NonStatic st = new Static_And_NonStatic();
		Static_And_NonStatic.sub();
		st.add();
		Static_And_NonStatic.divide();
		st.multiply();

	}

	public void add() {
		System.out.println("Non-Static method - Add");

	}

	public static void sub() {
		System.out.println("Static method - Sub");

	}

	public void multiply() {
		System.out.println("Non-Static method - multiply");

	}

	public static void divide() {
		System.out.println("Static method - divide");
	}

}
