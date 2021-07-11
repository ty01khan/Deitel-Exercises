import java.util.Scanner;

public class ThirtyNineEncryption {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.printf("Please enter a 4 digits integer: ");
		int num = inp.nextInt();
		int frst = num/1000;
		int scnd = (num/100) - 10*frst;
		int thrd = (num/10) - 100*frst - 10*scnd;
		int frth = num%10;
		
		int newFrst = ((num/10) - 100*frst - 10*scnd + 7) % 10;
		int newScnd = (num%10 + 7) % 10;
		int newThrd = (num/1000 + 7) % 10;
		int newFrth = ((num/100) - 10*frst + 7) % 10;
		
		int newNum = newFrst*1000 + newScnd*100 + newThrd*10 + newFrth;
		
		System.out.println("On encryption, " + num + " is converted to " + newNum);
	}
}
