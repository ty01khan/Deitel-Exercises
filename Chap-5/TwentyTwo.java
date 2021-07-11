public class TwentyTwo {
	public static void main(String[] args) {
		// First triangle
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(j > i)
				System.out.printf(" ");
				else
				System.out.printf("*");
			}
			
			for(int j = 19; j >= 10; j--) {
				if(j < 10+i)
				System.out.printf(" ");
				else
				System.out.printf("*");
			}
			
			for(int j = 20; j < 30; j++) {
				if(j >= i+20) 
					System.out.printf("*");
				else
					System.out.printf(" ");
			}
			
			for(int j = 30; j < 40; j++) {
				if(j < 39 - i) 
					System.out.printf(" ");
				else
					System.out.printf("*");
			}
			System.out.println();
		}
		
		System.out.println();	
	}
}
