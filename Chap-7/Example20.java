import java.security.SecureRandom;

public class Example20 {
	public static void main(String[] args) {
		SecureRandom rn = new SecureRandom();
		
		int ind = 0, score = -1;
		
		System.out.printf("P. No.\t1st Score    2nd Score    3rd Score     Total Score%n");
		for(int i = 0; i < 4; i ++) {
			int first = rn.nextInt(11);
			int second = rn.nextInt(11);
			int third = rn.nextInt(11);
			int total = first + second + third;
			
			System.out.printf("%3d%9d%13d%13d%14d%n", i+1, first, second, third, total);
			
			if(total > score) {
				score = total;
				ind = i;
			}
		}
		ind++;
		System.out.println("Player " + ind + " won");
	}
}
