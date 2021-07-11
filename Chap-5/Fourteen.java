import java.util.Scanner;

public class Fourteen {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		double principal = 1000.0;
		double rate;
		for(int i = 0; i < 6; i++) {
			System.out.printf("Please enter rate (in percentage): ");
			rate = inp.nextDouble();
			
			System.out.printf("%s\t%s%n", "Year", "Amount on deposit");
			for(int year = 1; year <= 10; year++) {
				double amount = principal * Math.pow((1 + rate/100), year);
				System.out.printf("%4d%,20.2f%n", year, amount);
			}
			System.out.println();
		}
	}
}
