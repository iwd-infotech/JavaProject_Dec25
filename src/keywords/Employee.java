package keywords;

public class Employee {

	public static void main(String[] args) {
		

	}
	
	Employee(){
		System.out.println("Default Constructor");
	}
	
	Employee(String name){
		this();  // Calls default Constructor
		System.out.println("Employee Name: " +name);
	}

}
