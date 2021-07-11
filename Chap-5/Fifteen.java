public class Fifteen {
	public static void main(String[] args) {
		// First triangle
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Second triangle
		for(int i = 0; i < 10; i++) {
			for(int j = 9; j >= i; j--) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Third triangle
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(j >= i) 
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Fourth triangle
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(j < 9 - i) 
					System.out.printf(" ");
				else
					System.out.printf("*");
			}
			System.out.println();
		}
	}
}
