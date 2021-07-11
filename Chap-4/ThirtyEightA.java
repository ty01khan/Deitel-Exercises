import java.util.Scanner;

public class ThirtySevenA {	
	static int fact(int n)
	{
		if(n == 0 | n == 1)
			return 1;
		
		return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.printf("Please eneter a non-negative integer: ");
		int n = inp.nextInt();
		System.out.println(n + "! = " + fact(n));
	}
}
