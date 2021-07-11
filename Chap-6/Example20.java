import java.util.Scanner;

public class Example20 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter a year: ");
		int num1 = inp.nextInt();
		
		if(isLeapYear(num1))
		System.out.println(num1 + " is a leap year");
		else
		System.out.println(num1 + " isn't a leap year");
	}
	
	public static boolean isLeapYear(int num) {
		return (num % 4 == 0) ? true : false;
	}
}
