import java.util.Scanner;

public class Example18 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int num1 = inp.nextInt();
		
		triangleOfNumbers(num1);
	}
	
	public static void triangleOfNumbers(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
