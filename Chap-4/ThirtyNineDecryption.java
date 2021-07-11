import java.util.Scanner;

public class ThirtyNineDecryption {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.printf("Please enter a 4 digits encrypted integer: ");
		int newNum = inp.nextInt();
		int newFrst = newNum/1000;
		int newScnd = (newNum/100) - 10*newFrst;
		int newThrd = (newNum/10) - 100*newFrst - 10*newScnd;
		int newFrth = newNum%10;
		
		int oldFrst = (newThrd-7 >= 0 ? newThrd-7 : newThrd+3);
		int oldScnd = (newFrth-7 >= 0 ? newFrth-7 : newFrth+3);
		int oldThrd = (newFrst-7 >= 0 ? newFrst-7 : newFrst+3);
		int oldFrth = (newScnd-7 >= 0 ? newScnd-7 : newScnd+3);
		
		int oldNum = oldFrst*1000 + oldScnd*100 + oldThrd*10 + oldFrth;
		
		System.out.println("On decryption of " + newNum + " the result is " + oldNum);
	}
}
