import java.util.Scanner;

public class FactTest {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		int num = input.nextInt();
		
		Fact ans = new Fact ();
		System.out.println (num + "! = " + ans.factorial(num));
	}
}
