import java.util.Scanner;

public class Example10 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter a number to round: ");
		double num = inp.nextDouble();
		
		System.out.println("Original number is " + num );
		System.out.println("Rounded to integer is " + roundToInteger(num));
		System.out.println("Rounded to tenths is " + roundToTenths(num));
		System.out.println("Rounded to hundredths is " + roundToHundredths(num));
		System.out.println("Rounded to thousandths is " + roundToThousandths(num));
	}
	
	public static int roundToInteger(double n) {
		return (int)Math.floor(n + 0.5);
	}
	
	public static double roundToTenths(double n) {
		return Math.floor(n*10 + 0.5)/10;
	}
	
	public static double roundToHundredths(double n) {
		return Math.floor(n*100 + 0.50)/100;
	}
	
	public static double roundToThousandths(double n) {
		return Math.floor(n*1000 + 0.500)/1000;
	}
}
