import java.util.Scanner;

public class Example8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter hours parked: ");
		double time = input.nextDouble();
		
		System.out.println("Parking charge = $" + calculateCharge(time));		
	}
	
	public static double calculateCharge(double time) {
		if(time <= 3)
			return 2.00;
		else
			if(2.00 + (Math.ceil(time)-3)*0.50 >= 10.00)
				return 10.00;
			else
				return 2.00 + (Math.ceil(time)-3)*0.50;
	}
}
