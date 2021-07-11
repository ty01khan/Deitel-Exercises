import java.util.Scanner;

public class Fourty {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.printf("Please enter a current world populations: ");
		float pop = inp.nextFloat();
		
		System.out.printf("Please enter population growth rate: ");
		float rate = inp.nextFloat(), before = 0;
		
		System.out.println("Year\tPopulations\tDifference");
		for(int i = 1; i <= 75; i++) {
			before = pop;
			pop *= 1+rate/100;
			System.out.printf("%d\t%f\t%f\n", i,  pop, (pop-before));
		}
	}
}
