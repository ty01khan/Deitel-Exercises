import java.util.Scanner;
import java.lang.*;

public class Example22 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter temperature in kelvin: ");
		double kelvin = inp.nextDouble();
		System.out.printf("%.2f K = %.2f degree celsius%n", kelvin, Celsius(kelvin));
		
		System.out.print("Please enter temperature in celsius: ");
		double celsius = inp.nextDouble();
		System.out.println(celsius + " degree celsius = " + Kelvin(celsius) + " K");
	}
	
	public static double Kelvin(double temp) {
			return temp + 273.15;
	}
	
	public static double Celsius(double temp) {
			return temp - 273.15;
	}
}
