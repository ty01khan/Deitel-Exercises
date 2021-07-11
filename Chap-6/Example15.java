import java.util.Scanner;

public class Example15 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter side-1 length: ");
		double side1 = inp.nextDouble();
		
		System.out.print("Please enter side-2 length: ");
		double side2 = inp.nextDouble();
		
		System.out.println("Hypotenuse of triangle is: " + hypotenuse(side1, side2));
		System.out.println("Math.hypot(" + side1 + ", " + side2 + ") = " + Math.hypot(side1, side2));
	}
	
	public static double hypotenuse(double side1, double side2) {
		return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
	}
}
