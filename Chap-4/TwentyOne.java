import java.util.Scanner;

public class TwentyOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int counter = 1, number, largest = Integer.MIN_VALUE;
		
		System.out.printf("Please enter 10 integers: ");
		while(counter <= 10) {
			number = input.nextInt();
			if(number > largest)
				largest = number;
			
			counter++;
		}
		
		System.out.println("\nLargest number among the ten is " + largest);
	}
}
