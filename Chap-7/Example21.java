import java.util.Scanner;

public class Example21 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int[][] grid = new int[12][12];
		
		int e = 0;
		int d = 0;
		int row = 0;
		int col = 0;
		
		while(e != 9) {
			int e = inp.nextInt();
			if(e == 2) {
				e = inp.nextInt();
				int step = inp.nextInt();
				
				if(d == 0) {
					for(int i = 0; i < step; i++) {
						A[row+i][0] = 1;
					}
					row += i;
				}
				else if(d == 3) {
					for(int i = 0; i < step; i++) {
						A[row][col+i] = 1;
					}
					col += i;
				}
				else if(d == 4) {
					for(int i = 0; i < step; i++) {
						A[row][col-i-1] = 1;
					}
					col -= i;
				}
			}
		}
	}
}
