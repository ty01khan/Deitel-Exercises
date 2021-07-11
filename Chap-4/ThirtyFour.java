import java.util.Scanner;

public class ThirtyFour {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.printf("Please enter an integer: ");
		int lim = inp.nextInt();
		int sum = 0;
		System.out.println("Limit is: " + lim);
		
		System.out.printf("Please start entering the integers: ");
		while(sum < lim) {
			int num = inp.nextInt();
			sum += num;
			System.out.println("Sum = " + sum);
		}
		
		System.out.println("\nSum of numbers exceeded the limit");
	}
}
