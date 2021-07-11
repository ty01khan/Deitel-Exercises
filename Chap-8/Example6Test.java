import java.util.Scanner;

public class Example6Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		double bals1 = inp.nextDouble();
		double bals2 = inp.nextDouble();
		double rate = 0.04;
		
		Example6 saver1 = new Example6(rate, bals1);
		Example6 saver2 = new Example6(rate, bals2);
		
		for(int month = 1; month <= 12; month++) {
			System.out.printf("Interest of saver1 of month %d: %.2f%n", month, saver1.calculateMonthlyInterest());
			System.out.printf("Interest of saver2 of month %d: %.2f%n", month, saver2.calculateMonthlyInterest());
		}
		
		System.out.printf("Saving balance of saver1: %.2f%n", saver1.getBalance());
		System.out.printf("Saving balance of saver2: %.2f%n", saver2.getBalance());
		
		System.out.println();
		
		Example6.modifyInterestRate(0.05);
		
		for(int month = 1; month <= 12; month++) {
			System.out.printf("Interest of saver1 of month %d: %.2f%n", month, saver1.calculateMonthlyInterest());
			System.out.printf("Interest of saver2 of month %d: %.2f%n", month, saver2.calculateMonthlyInterest());
		}
		
		System.out.printf("Saving balance of saver1: %.2f%n", saver1.getBalance());
		System.out.printf("Saving balance of saver2: %.2f%n", saver2.getBalance());
	}
}
