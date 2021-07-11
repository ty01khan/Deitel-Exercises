import java.util.Scanner;

public class TwentyFive {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.printf("Please enter an odd number between 1 and 19: ");
		int lim = inp.nextInt();
		
		int k, x = (lim+1)/2, y = lim/2;
		
		for(int i = 0; i < lim; i++) {
			if(i > y)
			k = lim - i - 1;
			else
			k = i;
			
			for(int j = 1; j <= lim; j++) {
				if(j >= x - k%x && j <= x + k%x)
				System.out.printf("*");
				else
				System.out.printf(" ");
			}
			System.out.println();
		}
	}
}
