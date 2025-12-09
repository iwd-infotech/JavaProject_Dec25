package oops;

public class ClassAndObject {

	static String name;   // variables
	int age;
	
	void study() {  // method
		System.out.println(name + " is studing");
	}
	
	public static void main(String[] args) {
//		ClassAndObject - Class name
//		s1 - Ref. variable
//		new - keyword 
//		ClassAndObject() - constructor 
//		new ClassAndObject();  - Object  
//		For non- static variables & methods if you are calling then create an object
		
		ClassAndObject s1 = new ClassAndObject();
		name = "Dev";
		s1.age = 20;
		s1.study();
		
	}
	
	


}
