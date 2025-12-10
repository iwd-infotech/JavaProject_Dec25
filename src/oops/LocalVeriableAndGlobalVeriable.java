package oops;

public class LocalVeriableAndGlobalVeriable {
	
	static int a = 100;  // global variable
	String name = "Java";
	int n = 200;

	public static void main(String[] args) {
		System.out.println(a);
		
		LocalVeriableAndGlobalVeriable obj = new LocalVeriableAndGlobalVeriable();
		
		System.out.println(obj.name);
		display(a + obj.n);

	}
	
	public static void display(int n) {
		int m = 200;   // Local Veriable
		System.out.println(m + n);
		LocalVeriableAndGlobalVeriable obj2 = new LocalVeriableAndGlobalVeriable();
		System.out.println(obj2.n);
	}
	
	public void demo() {
		int b = 200;
		System.out.println(a + b);
		
	}

}
