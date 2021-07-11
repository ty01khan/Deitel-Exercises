import java.util.Scanner;

public class Example26 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter a 4 digits number: ");
		int n = inp.nextInt();
		
		System.out.println("Sum of digits of " + n + " is " + sumDigits(n));
	}
	
	public static int sumDigits(int n) {
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += (n % 10);
			n /= 10;
		}
		sum += n;
		
		return sum;
	}
}
