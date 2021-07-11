import java.util.Scanner;

public class ThirtyThree {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		double wt, ht, BMI;
		
		System.out.print("Please enter your weight(in kg): ");
		wt = inp.nextDouble();
		
		System.out.print("Please enter your height(in meters): ");
		ht = inp.nextDouble();
		
		BMI = wt / (ht * ht);
		
		System.out.print("BMI = " + BMI);
		
		if (BMI <= 18.5)
		System.out.println(" and BMI Category is Underweight");
		else if (BMI > 18.5 && BMI <= 24.9)
		System.out.println(" and BMI Category is Normal weight");
		else if (BMI > 24.9 && BMI <= 29.9)
		System.out.println(" and BMI Category is Overweight");
		else
		System.out.println(" and BMI Category is Obesity");
	}
}
