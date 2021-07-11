import java.util.Scanner;

public class Example19 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter a number and a character: ");
		int num1 = inp.nextInt();
		char fillChar = inp.next().charAt(0);
		triangleOfNumbers(num1, fillChar);
	}
	
	public static void triangleOfNumbers(int num, char fillChar) {
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(fillChar);
			}
			System.out.println();
		}
	}
}
