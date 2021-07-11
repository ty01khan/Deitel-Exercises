import java.util.Scanner;

public class ThirtySix {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.printf("Please enter x and y coordinates of first point: ");
		int x1 = inp.nextInt(), y1 = inp.nextInt();
		
		System.out.printf("Please enter x and y coordinates of second point: ");
		int x2 = inp.nextInt(), y2 = inp.nextInt();
		
		
		System.out.printf("Distance between both points is: %.2f \n", Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)));
		
		if(x1 - x2 == 0)
			System.out.println("Line joining both points is perpendicular to x-axis");
		else if(y1 - y2 == 0)
			System.out.println("Line joining both points is perpendicular to y-axis");
		else
			System.out.println("Line joining both points is not perpendicular to any axis");
	}
}
