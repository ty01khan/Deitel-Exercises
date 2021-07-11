import java.security.SecureRandom;
import java.util.Scanner;

public class Example29 {
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	private enum Coin {HEADS, TAILS};
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		Coin toss;
		
		System.out.print("Please enter a number: ");
		int n = inp.nextInt(), i = 0;
		int cntHeads = 0, cntTails = 0;
		
		while(i < n) {
			int x = tossCoin();
			/*switch(x) {
				case 0: 
					toss = Coin.HEADS;
					break;
				
				case 1: 
					toss = Coin.TAILS;
					break;
			}
			
			if(toss == Coin.HEADS) {
				cntHeads++;
			}
			else {
				cntTails++;
			}*/
			if(x == 0)
			cntHeads++;
			else
			cntTails++;
			i++;	
		}
		
		System.out.println("Count Heads = " + cntHeads + ", Count Tails = " + cntTails);
	}
	
	public static int tossCoin() {
		return randomNumbers.nextInt(2);
	}
}
