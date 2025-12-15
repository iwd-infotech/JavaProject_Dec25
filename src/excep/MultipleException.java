package excep;

public class MultipleException {
//	Can we use single try & multiple catch blocks - Yes
//	Can we use multiple try & Single catch blocks - Not Possible in java

	public static void main(String[] args) {
		
		try {
			int a[] = new int[3];
			a[5] = 10;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index Error");
		} catch (Exception e) {
			System.out.println("General Error");
		}

	}

}
