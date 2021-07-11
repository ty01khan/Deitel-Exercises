public class TwentyFour {
	public static void main(String[] args) {
		int k;
		for(int i = 0; i < 9; i++) {
			if(i > 4)
			k = 8 - i;
			else
			k = i;
			
			for(int j = 1; j <= 9; j++) {
				if(j >= 5 - k%5 && j <= 5 + k%5)
				System.out.printf("*");
				else
				System.out.printf(" ");
			}
			System.out.println();
		}
	}
}
