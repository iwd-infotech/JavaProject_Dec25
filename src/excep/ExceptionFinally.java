package excep;

public class ExceptionFinally {

	public static void main(String[] args) {
//		Test123
		try {
			int a[] = new int[3];
			a[5] = 10;
			
			int num = Integer.parseInt("ABC");
			
		}
		finally {
			System.out.println("Closing the program");
		}

	}

}
