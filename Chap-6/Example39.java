import java.util.Scanner;
import java.security.SecureRandom;

public class Example39 {
	private static final SecureRandom rNo = new SecureRandom();
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter the difficulty level (1|2|3|4): ");
		int difficult = inp.nextInt();
		
		System.out.printf("%n\tEnter 1 for addition%n\tEnter 2 for subtraction%n\tEnter 3 for multiplication%n\tEnter 4 for division%n\tEnter 5 for mixture%nPlease enter the arithmetic: ");
		int arithmetic = inp.nextInt();
		
		int crct = 0, wrng = 0;
		
		while(crct + wrng < 10) {
			int a = generateQuestion(difficult, arithmetic);
			int ans = inp.nextInt();
			
			while(ans != a) {
				wrng++;
				int n = 1 + rNo.nextInt(4);
			
				switch(n) {
					case 1:
						System.out.printf("No. Please try again%n%n");
						break;
					case 2:
						System.out.printf("Wrong. Try once more.%n%n");
						break;
					case 3:
						System.out.printf("Don't give up!%n%n");
						break;
					default:
						System.out.printf("No. Keep trying.%n%n");
						break;
				}
				System.out.print("Enter answer: ");
				ans = inp.nextInt();
			}
			
			crct++;
			int n = 1 + rNo.nextInt(4);
			switch(n) {
				case 1:
					System.out.printf("Very good!%n%n");
					break;
				case 2:
					System.out.printf("Excellent!%n%n");
					break;
				case 3:
					System.out.printf("Nice work!%n%n");
					break;
				default:
					System.out.printf("Keep up the good work!%n%n");
					break;
			}
		}
		
		double percentage = (double)(crct * 100 / (crct+wrng));
		System.out.println("Your percentage is " + percentage);
		
		if(percentage > 75) {
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
		else {
			System.out.println("Please ask your teacher for extra help");
		}
	}
	
	public static int generateQuestion(int difficult, int arithmetic) {
		int a, b;
		if(difficult == 1) {
			a = 1 + rNo.nextInt(9);
			b = 1 + rNo.nextInt(9);
		}
		else if(difficult == 2) {
			a = (int)Math.floor(Math.random()*(99 - 10 + 1) + 10);
			b = (int)Math.floor(Math.random()*(99 - 10 + 1) + 10);
		}
		else if(difficult == 3) {
			a = (int)Math.floor(Math.random()*(999 - 100 + 1) + 100);
			b = (int)Math.floor(Math.random()*(999 - 100 + 1) + 100);
		}
		else {
			a = (int)Math.floor(Math.random()*(9999 - 1000 + 1) + 1000);
			b = (int)Math.floor(Math.random()*(9999 - 1000 + 1) + 1000);
		}
		
		if(arithmetic == 1) {
			System.out.print("How much when " + a + " is added to " + b + ": ");
			return (a+b);
		}
		else if(arithmetic == 2) {
			System.out.print("How much when " + a + " is subtracted from " + b + ": ");
			return (a-b);
		}
		else if(arithmetic == 3) {
			System.out.print("How much is " + a + " times " + b + ": ");
			return (a*b);
		}
		else if(arithmetic == 4) {
			System.out.print("How much when " + a + " is divided b " + b + ": ");
			return (a/b);
		}
		else {
			System.out.printf("Simplify %d + %d * %d - %d / %d: ", a, b, a, b, a);
			return (a+b*a-b/a);
		}
	}
}
