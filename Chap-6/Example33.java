import java.util.Scanner;
import java.security.SecureRandom;

public class Example33 {
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	private enum Status {CONTINUE, WON, LOST};
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int bankBalance = 1000;
		
		while(bankBalance > 0) {
			System.out.print("Please enter wage (< " + bankBalance + "): ");
			int wage = inp.nextInt();
			
			int myPoint = 0;
			Status gameStatus;
			
			int sumOfDice = rollDice();
			
			switch(sumOfDice) {
				case SEVEN:
				case YO_LEVEN:
					gameStatus = Status.WON;
					break;
				
				case SNAKE_EYES:
				case TREY:
				case BOX_CARS:
					gameStatus = Status.LOST;
					break;
				
				default:
					gameStatus = Status.CONTINUE;
					myPoint = sumOfDice;
					System.out.println("Point is " + myPoint);
					break;
			}
			
			while(gameStatus == Status.CONTINUE) {
				sumOfDice = rollDice();
				
				if(sumOfDice == myPoint) {
					gameStatus = Status.WON;
				}
				else {
					if(sumOfDice == SEVEN) {
						gameStatus = Status.LOST;
					}
				}
			}
			
			if(gameStatus == Status.WON) {
				System.out.println("Player wins");
				bankBalance += wage;
			}
			else {
				System.out.println("Player loses");
				bankBalance -= wage;
			}
			
			System.out.println("Bank balance = " + bankBalance);
			chatter();
		}
	}
	
	public static int rollDice() {
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		
		int sum = die1 + die2;
		
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
		
		return sum;
	}
	
	public static void chatter() {
		int index = 1 + randomNumbers.nextInt(3);
		
		if(index == 1) {
			System.out.println("Oh, you're going to broke, huh?");
			System.out.println();
		}
		else if(index == 2) {
			System.out.println("Aw c'mon, take a chance!");
			System.out.println();
		}
		else {
			System.out.println("You're up big. Now's the time to cash in your chips");
			System.out.println();
		}
	}
}
