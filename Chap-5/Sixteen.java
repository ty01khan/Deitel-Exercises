import java.util.Scanner;

public class Sixteen {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			Scanner inp = new Scanner(System.in);
			
			System.out.printf("Please enter an integer between 1 and 30: ");
			int num = inp.nextInt();
			
			if(num > 30 || num < 1) {
				System.out.println("Please enter number between 1 and 30\n");
				i--;
				continue;
			}
			
			for(int j = 0; j < num; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
