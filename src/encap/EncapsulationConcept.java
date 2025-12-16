package encap;

public class EncapsulationConcept {
	
//	What is Encapsulation? 
//	Data Hiding & Data Protection
//	Why Encapsulation? 
//	1. To protect data
//	2. To restrict the data
//	3. To allow controlled access 
//	4. To achieve security 

	private String name;
	private double balance;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;  // confusion
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		EncapsulationConcept obj = new EncapsulationConcept();
		obj.setName("Sanjeevani");
		obj.setBalance(10000.50);
		
		System.out.println("Name: " + obj.getName());
		System.out.println("Balance: " +obj.getBalance());;

	}

}
