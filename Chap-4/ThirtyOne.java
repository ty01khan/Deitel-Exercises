import java.util.Scanner;

public class ThirtyOne {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.printf("Please enter a five digit number: ");
		int num = inp.nextInt();
		
		if(num/10000 > 9 || num/10000 < 1) {
			System.out.println("Entered number is not a five digit number, Please enter a five digit number: ");
		    num = inp.nextInt();
		}
		
		/*System.out.println(num/10000);
		System.out.println(num%10);
		System.out.println(num/1000);
		System.out.println(10*(num/10000));
		System.out.println((num%100)/10);*/
		if(num/10000 == num%10 && num/1000 - (10*(num/10000)) == (num%100)/10)
			System.out.println(num + " is a palindrome number");
		else
			System.out.println(num + " is not a palindrome number");
	}
}
