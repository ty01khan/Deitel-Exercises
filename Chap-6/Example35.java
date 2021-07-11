import java.util.Scanner;
import java.security.SecureRandom;

public class Example35 {
	private static final SecureRandom rNo = new SecureRandom();
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		while(true) {
			int a = generateQuestion();
			int ans = inp.nextInt();
			
			while(ans != a) {
				System.out.printf("No. Please try again.%n%n");
				System.out.print("Enter answer: ");
				ans = inp.nextInt();
			}
			
			System.out.printf("Very good!%n%n");
			
			System.out.print("Enter 0 to exit or 1 to continue: ");
			int exit = inp.nextInt();
			if(exit == 0)
				break;
		}
	}
	
	public static int generateQuestion() {
		int a = 1 + rNo.nextInt(9);
		int b = 1 + rNo.nextInt(9);
		
		System.out.print("How much is " + a + " times " + b + ": ");
		return (a*b);
	}
}
