import java.util.Scanner;

public class Thirty
{
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int num = inp.nextInt();
		
		for(int i = 1; i <= 5; i++) {
			double p = Math.pow(10, 5-i);
			int power = (int)Math.round(p);
			int rem = num / power;
			num = num % power;
			
			if(i != 5)
			System.out.print(rem + "   ");
			else
			System.out.println(rem);
		}
	}
}
