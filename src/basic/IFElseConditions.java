package basic;

public class IFElseConditions {

	public static void main(String[] args) {
		int age = 15;
		
		if(age >=18) {
			System.out.println("Eligible to Vote");
		}
		
		int marks = 40;
		
		if (marks >=35) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		int a = 50;
		int b = 100;
		
		if(a<b) {
			System.out.println("A is smaller than B");
		}else {
			System.out.println("B is smaller than A");
		}

	}

}
