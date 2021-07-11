import java.util.Scanner;

public class Example32 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter x and y coordinate or point-1: ");
		double x1 = inp.nextDouble();
		double y1 = inp.nextDouble();
		
		System.out.print("Please enter x and y coordinate of point-2: ");
		double x2 = inp.nextDouble();
		double y2 = inp.nextDouble();
		
		System.out.printf("Distance b/w point-1 and point-2 is %.2f%n", distance(x1, y1, x2, y2));
	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
	}
}
