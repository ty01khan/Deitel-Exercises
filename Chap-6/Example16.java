import java.util.Scanner;

public class Example16 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter first argument: ");
		int num1 = inp.nextInt();
		
		System.out.print("Please enter second argument: ");
		int num2 = inp.nextInt();
		
		if(isMultiple(num1, num2))
			System.out.println(num2 + " is a multiple of " + num1);
		else
			System.out.println(num2 + " is not a multiple of " + num1);
	}
	
	public static boolean isMultiple(int num1, int num2) {
		return (num2 % num1 == 0) ? true : false;
	}
}
