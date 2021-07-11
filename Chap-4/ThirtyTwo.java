import java.util.Scanner;

public class ThirtyTwo {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.printf("Please enter a binary integer: ");
		int num = inp.nextInt();
		int decimal = 0, cnt = 0, number = num;
		
		while(num > 0) {
			decimal += Math.pow(2, cnt) * (num % 10);
			num /= 10;
			cnt++;
		}
		
		System.out.println("Decimal equivalent to " + number + " binary is: " + decimal);
	}
}
