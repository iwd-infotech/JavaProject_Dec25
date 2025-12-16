package keywords;

public class ThisMethod {

	public static void main(String[] args) {
		

	}
	
	void show() {
		System.out.println("Show method");
	}
	
	void display() {
		this.show();  // optional but clear
		System.out.println("Display Method");
	}

}
