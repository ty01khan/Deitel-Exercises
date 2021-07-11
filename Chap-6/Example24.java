import java.util.Scanner;

public class Example24 {
	public static void main(String[] args) {
		//Scanner inp = new Scanner(System.in);
		
		//System.out.print("Please enter anumber to check weather it is perfect number or not: ");
		//int n = inp.nextInt();
		
		for(int i = 1; i <= 1000; i++) {
			if(isPerfect(i)) {
				System.out.println(i + " is a perfect number");
				findFactors(i);
			}
		}
	}
	
	public static void findFactors(int n) {
		System.out.print("Factors of " + n + " are: ");
		for(int i = 1; i <= n/2; i++) {
			if(n % i == 0)
				System.out.print(i + " ");
		}
		System.out.printf("%n%n");
	}
	
	public static boolean isPerfect(int n) {
		int cnt = 0;
		for(int i = 1; i <= n/2; i++) {
			if(n % i == 0)
				cnt += i;
		}
		
		return (cnt == n) ? true : false;
	}
}
