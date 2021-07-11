import java.util.Scanner;

public class Example17 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter 10 integers: ");
		for(int i = 0; i < 10; i++) {
			int num = inp.nextInt();
			
			if(isDivisible(num))
				System.out.println(num + " is a multiple of 5");
			else
				System.out.println(num + " is not a multiple of 5");
		}
	}
	
	public static boolean isDivisible(int num) {
		return (num % 5 == 0) ? true : false;
	}
}
