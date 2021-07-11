import java.util.*;

public class FifteenApplication {
	public static void main(String [] args) {
		Scanner inp = new Scanner(System.in);
		
		// create two object of Eleven class and assign it to account1, account2
		Fifteen account1 = new Fifteen("Talha Yaseen", 50.00);
		Fifteen account2 = new Fifteen("SomeX", -10.00);
	
		displayAccount(account1);
		displayAccount(account2);
		
		System.out.println();
		
		System.out.printf("Please enter deposit amount for account1: ");
		double depositAmount = inp.nextDouble();
		System.out.printf("%nAdding %.2f amount to account1 balance...%n%n", depositAmount);
		account1.deposit(depositAmount);
		
		System.out.printf("Please enter deposit amount for account2: ");
		depositAmount = inp.nextDouble();
		System.out.printf("%nAdding %.2f amount to account2 balance...%n%n", depositAmount);
		account2.deposit(depositAmount);
		
		displayAccount(account1);
		displayAccount(account2);
		
		System.out.printf("%nPlease enter withdraw amount for account1: ");
		double withdrawAmount = inp.nextDouble();
		System.out.printf("%nWithdrawing %.2f amount from account1 balance...%n%n", withdrawAmount);
		account1.withdraw(withdrawAmount);
		
		System.out.printf("Please enter withdraw amount for account2: ");
		withdrawAmount = inp.nextDouble();
		System.out.printf("%nWithdrawing %.2f amount from account2 balance...%n%n", withdrawAmount);
		account2.withdraw(withdrawAmount);
		
		displayAccount(account1);
		displayAccount(account2);
	}
	
	public static void displayAccount(Fifteen accountToDisplay) {
		System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
	}
}
