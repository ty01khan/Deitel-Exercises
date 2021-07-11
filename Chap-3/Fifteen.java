public class Fifteen {
	private String name;	// instance variable
	private double balance;
	
	// method to set the name in the object
	public Fifteen(String name, double balance) {
		this.name = name;
		
		if(balance > 0.0) {
			this.balance = balance;
		}
	}
	
	// method to retrieve the name from the object
	public void deposit(double depositAmount) {
		if(depositAmount > 0.0) {
			balance = balance + depositAmount;
		}
	}
	
	// method that withdraw a valid amount from the balance
	public void withdraw(double withdrawAmount) {
		if(withdrawAmount > balance) {
			System.out.println("Withdrawl amount exceded account balance");
			System.out.println();
		}
		else {
			balance = balance - withdrawAmount;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
