import java.util.Scanner;

public class Example23 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter a number to check whether it is palindrome or not: ");
		int n = inp.nextInt();
		
		if(isPalindrome(n))
		System.out.println(n + " is a palindrome number");
		else
		System.out.println(n + " is not a palindrome number");
	}
	
	public static boolean isPalindrome(int n) {
		int temp = n, rev = 0;
		
		while(temp > 0) {
			rev = (rev*10) + (temp%10);
			temp /= 10;
		}
		
		return (n == rev) ? true : false;
	}
}
