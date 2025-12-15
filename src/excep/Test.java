package excep;

public class Test {
	
//	Exception is an error at runtime that stop the program
//	Exception Handling allows program to continue running safely.

	public static void main(String[] args) {
//		int a = 10/0;   // ArithmeticException
		
		try {
			int a = 10/0;
			System.out.println(a);
		} 
		catch (Exception e) {
			System.out.println("Cannot divide by zero");
		}
		
		System.out.println("Remaining code");

	}

}
