import java.util.Scanner;

public class ThirtyFour {
	
	public static void main (String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print ("Please enter current world population (in 100 cr): ");
		double pop = inp.nextDouble();
		System.out.print ("Please enter annual world population growth rate: ");
		double rate = inp.nextDouble();
		
		System.out.println ();
		
		for(int i = 1; i <= 4; i++) {			
			if (i == 1)
			System.out.printf ("After %d year, world population would be: %f%n", i, (pop + pop*rate/100));
			else
			System.out.printf ("After %d years, world population would be: %f%n", i, pop * Math.pow(1+(rate/100), i));
		}
		
	}
}
