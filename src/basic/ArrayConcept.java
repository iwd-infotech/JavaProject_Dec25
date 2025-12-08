package basic;

public class ArrayConcept {

	public static void main(String[] args) {
		
//		int c = 20;
//		Array is used to store similar data types is known as Array.
//		Array index start from zero ex: a[5] 5-1 = 4  [0 to 4]
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
//		a[5] = 60;   Exception - ArrayIndexOutOfBoundsException
		System.out.println(a[2]);
//		System.out.println(a[5]);
		for (int i = 0; i <a.length; i++) {
			System.out.println(a[i]);
		}
		
		double d[] = new double[5];
		
		Object o[] = new Object[5];
		o[0] = 33.33;
		o[1] = "Java";
		o[2] = 10;

	}

}
