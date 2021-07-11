import java.util.Scanner;

public class Example29 {
	static double fibonacci(int n) {
		int t1 = 0;
		int t2 = 1;
		for(int i = 2; i < n; i++) {
			t2 = t1+t2;
			t1 = t2 - t1;
		}
		return t2;
	}
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		/*System.out.print("Please enter n: ");
		int n = inp.nextInt();
		
		System.out.println("Fibonacci " + n + "th term is " + fibonacci(n));*/
		
		int cnt = 1;
		while(fibonacci(cnt) > 0) {
			System.out.println(cnt + "\t" + fibonacci(cnt));
			cnt++;
		}
	}
}
