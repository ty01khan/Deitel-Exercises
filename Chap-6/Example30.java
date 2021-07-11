import java.util.Scanner;

public class Example30 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter a number b/w 1 to 1000 to guess: ");
		int n = inp.nextInt();
		
		binSearch(n, inp);
		
		while(true) {
			System.out.print("If you want to play again, then type YES otherwise NO: ");
			String play = inp.next();
			
			if(play.equals("NO"))
				break;

			System.out.print("Please enter a number b/w 1 to 1000 to guess: ");;
			n = inp.nextInt();
			binSearch(n, inp);
		}
		
	}
	
	public static void binSearch(int n, Scanner inp) {		
		while(true) {
			System.out.print("Please enter your guess b/w 1 to 1000: ");
			int num = inp.nextInt();
			if(num == n) {
				System.out.printf("Congratulations. You gussed the number!%n%n");
				break;
			}
			
			if(num > n)
			System.out.println("Too high. Try again.");
			else
			System.out.println("Too low. Try again.");
		}
	}
}
