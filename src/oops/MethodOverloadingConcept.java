package oops;

public class MethodOverloadingConcept {

	//	If method name is same but different input parameters within the same class is known as method overloading

	public static void main(String[] args) {


	}

//	Can we overload main method ? -> Yes we can but this is not a good practice
//	public static void main() {
//
//	}

	public void display() {  // zero input parameter 
		System.out.println("Display Method zero input parameter");
	}

	public void display(int a) { // 1 input parameter
		System.out.println("Display Method 1 input parameter");
	}

	public void display(int m, int n) { // 2 input parameter
		System.out.println(m+n);
		System.out.println("Display Method 2 input parameter");
	}
	
	public void display(boolean b) { // 1 input parameter with diff. datatype
		System.out.println("Display Method 1 input parameter");
	}

}
