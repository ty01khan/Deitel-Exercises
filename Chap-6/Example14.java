import java.util.Scanner;

public class Example14 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter a number to round: ");
		double num = inp.nextDouble();
		
		System.out.println("myFloor(" + num + ") = " + myFloor(num));
		System.out.println("myCeil(" + num + ") = " + myCeil(num));
	}
	public static int myFloor(double n) {
		int x = (int)n;
		return x;
	}
	
	public static int myCeil(double n) {
		int x = (int)n;
		return x+1;
	}
}
