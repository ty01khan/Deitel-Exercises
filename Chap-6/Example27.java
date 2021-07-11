import java.util.Scanner;

public class Example27 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter 2 numbers to find gcd: ");
		int n1 = inp.nextInt();
		int n2 = inp.nextInt();
		
		System.out.println("GCD of " + n1 + " and " + n2 + " is " + gcd(n1, n2));
		
		System.out.println("GCD of " + n1 + " and " + n2 + " is " + Euclid(n1, n2));
	}
	
	public static int gcd(int n1, int n2) {
		if(n1 == 1 || n2 == 1)
			return 1;
		else if(n1 == n2)
			return n1;
			
		if(n1 > n2)	{
			if(n1 % n2 != 0)
				return gcd(n1-n2, n2);
			else
				return n2;
		}
		else {
			if(n2 % n1 != 0)
				return gcd(n1, n2-n1);
			else
				return n1;
		}
	}
	
	public static int Euclid(int n1, int n2) {
		if(n1 == 0)
			return n2;
		
		return Euclid(n2%n1, n1);
	}
}
