import java.util.Scanner;

public class ThirtyTwo {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Please enter any 5 expenses: ");
		int total = 0;
		for(int i = 0; i < 5; i++) {
			int exp = inp.nextInt();
			total += exp;
		}
		
		System.out.println("Total expenses is: " + total + " and Tax for all expenses is: " + (float) total * 0.3);
	}
}
