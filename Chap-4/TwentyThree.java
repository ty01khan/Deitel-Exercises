import java.util.Scanner;

public class TwentyThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int counter = 1, number, largest1 = Integer.MIN_VALUE, largest2 = Integer.MIN_VALUE;
		
		System.out.printf("Please enter 10 integers: ");
		while(counter <= 10) {
			number = input.nextInt();
				
			if(number >= largest1) {
				largest2 = largest1;
				largest1 = number;
			}
			
			if(number > largest2 && number < largest1)
				largest2 = number;
			
			counter++;
		}
		
		System.out.println("\nTwo Largest numbers among the ten are " + largest1 + " and " + largest2);
	}
}
