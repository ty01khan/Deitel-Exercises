import java.util.Scanner;
import java.security.SecureRandom;

public class Example37 {
	private static final SecureRandom rNo = new SecureRandom();
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int crct = 0, wrng = 0;
		
		while(crct + wrng < 10) {
			int a = generateQuestion();
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
	
	public static int generateQuestion() {
		int a = 1 + rNo.nextInt(9);
		int b = 1 + rNo.nextInt(9);
		
		System.out.print("How much is " + a + " times " + b + ": ");
		return (a*b);
	}
}
