import java.util.Scanner;

public class ThirtyTwo {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int cntNeg = 0, cntPos = 0, cntZero = 0;
		for(int i = 1; i <= 5; i++) {
			int num = inp.nextInt();
			
			if(num == 0)
			cntZero++;
			else if (num > 0)
			cntPos++;
			else
			cntNeg++;
		}
		
		System.out.println("Number of positive integers are " + cntPos);
		System.out.println("Number of negative integers are " + cntNeg);
		System.out.println("Number of integers whose value = 0 are " + cntZero);
	}
}
