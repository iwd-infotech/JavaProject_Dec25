package constr;

public class Students {
	
	String name;
	int age;

	public static void main(String[] args) {
		Students stu = new Students("Amit", 25);
		stu.show();

	}
	
	Students(String s, int n){
		name = s;
		age = n;
		
	}
	
	void show() {
		System.out.println(name + " - " +age);
	}

}
