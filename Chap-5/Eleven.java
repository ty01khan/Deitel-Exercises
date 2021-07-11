import java.util.Scanner;

public class Eleven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Please enter n: ");
		int n = input.nextInt();
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		for(int i = 0; i < n; i++) {
			int num = input.nextInt();
			if(max < num)
				max = num;
			
			if(min > num)
				min = num;
		}
		
		System.out.println("Minimum value is " + min + " and Maximum value is " + max);
		System.out.println("Sum of extremes: " + (min+max));
		
	}
}
