import java.util.Scanner;

public class Example9 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter a number to round: ");
		double num = inp.nextDouble();
		
		System.out.println("Original number is " + num + " and rounded number is " + round(num));
	}
	
	public static int round(double n) {
		if(n > Math.floor(n) + 0.5)
			return (int)Math.floor(n)+1;
		else
			return (int)Math.floor(n);
	}
}
