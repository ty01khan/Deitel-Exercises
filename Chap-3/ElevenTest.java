import java.util.*;

public class ElevenTest {
	public static void main(String [] args) {
		Scanner inp = new Scanner(System.in);
		
		// create two object of Eleven class and assign it to account1, account2
		Eleven account1 = new Eleven("Talha Yaseen", 50.00);
		Eleven account2 = new Eleven("SomeX", -10.00);
	
		System.out.printf("%s initial balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s initial balance: $%.2f%n", account2.getName(), account2.getBalance());
		
		System.out.println();
		
		System.out.printf("Please enter deposit amount for account1: ");
		double depositAmount = inp.nextDouble();
		System.out.printf("%nAdding %.2f amount to account1 balance...%n%n", depositAmount);
		account1.deposit(depositAmount);
		
		System.out.printf("Please enter deposit amount for account2: ");
		depositAmount = inp.nextDouble();
		System.out.printf("%nAdding %.2f amount to account2 balance...%n%n", depositAmount);
		account2.deposit(depositAmount);
		
		System.out.printf("%s current balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s current balance: $%.2f%n", account2.getName(), account2.getBalance());
		
		System.out.printf("%nPlease enter withdraw amount for account1: ");
		double withdrawAmount = inp.nextDouble();
		System.out.printf("%nWithdrawing %.2f amount from account1 balance...%n%n", withdrawAmount);
		account1.withdraw(withdrawAmount);
		
		System.out.printf("Please enter withdraw amount for account2: ");
		withdrawAmount = inp.nextDouble();
		System.out.printf("%nWithdrawing %.2f amount from account2 balance...%n%n", withdrawAmount);
		account2.withdraw(withdrawAmount);
		
		System.out.printf("%s current balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s current balance: $%.2f%n", account2.getName(), account2.getBalance());
	}
}
