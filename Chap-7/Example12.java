import java.util.Scanner;

public class Example12 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int[] A = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		
		System.out.println("Please enter 10 numbers in range [10, 100]: ");
		for(int i = 0; i < 10; i++) {
			int n = inp.nextInt();
			A[i] = n;
			System.out.print(A[i] + " ");
		}
		
		System.out.printf("%nArray after removing duplicates is: ");
		for(int i = 1; i < 10; i++) {
			for(int j = 0; j < i; j++) {
				if(A[i] == A[j]) {
					A[i] = -1;
					break;
				}
			}
		}
		
		for(int i = 0; i < 10; i++) {
			if(A[i] != -1)
			System.out.print(A[i] + " ");
		}
		System.out.println();
		
	}
}
