public class Example6 {
	static double annualInterestRate;
	private double savingBalance;
	
	public Example6(double rate, double balance) {
		annualInterestRate = rate;
		this.savingBalance = balance;
	}
	
	public double calculateMonthlyInterest() {
		savingBalance += (savingBalance*annualInterestRate/12);
		return savingBalance*annualInterestRate/12;
	}
	
	public static void modifyInterestRate(double rate) {
		annualInterestRate = rate;
	}
	
	public double  getBalance() {
		return savingBalance;
	}
}
