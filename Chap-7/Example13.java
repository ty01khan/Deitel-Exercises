public class Example13 {
	public static void main(String[] args) {
		int[][] mat = new int[4][4];
		
		for(int col = 0; col < 4; col++) {
			for(int row = 0; row < 4; row++) {
				mat[row][col] = row+col;
				System.out.print(mat[row][col] + " ");
			}
			System.out.println();
		}
	}
}
