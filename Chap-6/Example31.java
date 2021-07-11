import java.util.Scanner;

public class Example31 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter a number b/w 1 to 1000 to guess: ");
		int n = inp.nextInt();
		
		binSearch(n, inp);
		
		while(true) {
			System.out.printf("%nIf you want to play again, then type YES otherwise NO: ");
			String play = inp.next();
			
			if(play.equals("NO"))
				break;

			System.out.print("Please enter a number b/w 1 to 1000 to guess: ");;
			n = inp.nextInt();
			binSearch(n, inp);
		}
		
	}
	
	public static void binSearch(int n, Scanner inp) {
		int cnt = 1;
		
		while(true) {
			System.out.print("Please enter your guess b/w 1 to 1000: ");
			int num = inp.nextInt();
			if(num == n) {
				System.out.printf("Congratulations. You gussed the number!%n%n");
				System.out.printf("Count = %d%n", cnt);
				
				if(cnt < 10) {
					System.out.println("Either you know the secret or you got lucky!");
				}
				else if(cnt == 10) {
					System.out.println("Aha! You know the secret!");
				}
				else {
					System.out.println("You should be able to do better!");
				}
				
				break;
			}
			
			if(num > n)
			System.out.printf("Too high. Try again.%n%n");
			else
			System.out.printf("Too low. Try again.%n%n");
			cnt++;
		}
	}
}
