import java.security.SecureRandom;

public class Example17 {
	public static void main(String[] args) {
		SecureRandom rn = new SecureRandom();
		
		int[] frequency = new int[11];
		
		for(int roll = 1; roll <= 36_000_000; roll++) {
			++frequency[rn.nextInt(6) + rn.nextInt(6)];
		}
		
		System.out.printf("%7d%9d%9d%9d%9d%9d%n", 1, 2, 3, 4, 5, 6);
		for(int i = 0; i < 6; i++) {
			System.out.printf("%d  ", i+1);
			for(int j = 0; j < 6; j++) {
				System.out.printf("%d  ", frequency[i+j]);
			}
			System.out.println();
		}
	}
}
