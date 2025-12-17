package string;

public class StringClass {

	public static void main(String[] args) {
		String str = new String("Java");
		String str2 = "Java";
		String str3 = "Python";
		String str4 = new String("Selenium");
		String str5 = new String("Java");
		String str6 = "Selenium"; 
		String str7 = "   Python ";    // (java.replace("a","o"))
		
		// String Methods:
//		length()
		System.out.println(str.length());
//		equals() -> compares content
//		== -> "    compares memory reference / address comparison   "
		
		System.out.println(str == str2);   // false
		System.out.println(str4.equals(str6));   //true
		System.out.println(str3 == str7);  //true
		System.out.println(str3.equals(str7));  //true
		System.out.println(str4 == str6);   //false
		
		System.out.println(str7.length());
		String Str8 = str7.trim();  // starting space & Ending Space
		System.out.println(Str8.length());
		
		System.out.println("java".toUpperCase());
		System.out.println("java".replace("a", "o"));
		

	}

}
