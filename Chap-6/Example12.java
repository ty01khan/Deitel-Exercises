import java.util.Scanner;

public class Example12 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter a range: ");
		int num1 = inp.nextInt();
		int num2 = inp.nextInt();
		
		System.out.println("Random generated number is: " + random(num1, num2));
	}
	
	public static int random(int num1, int num2) {
		return (int)Math.floor(Math.random()*(num2 - num1 + 1) + num1);
	}
}
