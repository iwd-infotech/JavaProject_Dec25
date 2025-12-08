package basic;

public class StringConcept {

	public static void main(String[] args) {
		String str = "Java";
		String str2 = "Selenium";
		String str3 = new String("Selenium");
		
		int a = 100;
		int b = 200;
		
		String c = "300";
		
		System.out.println(str+str2);
		System.out.println(str+b);  // Java200
		System.out.println(a+c);  // 100300
		System.out.println(a+b+str+a+b);  // 300Java100200
		System.out.println(a+b+str+(a+b));  // 
		

	}

}
