import java.util.Arrays;

public class Example15 {
	public static void main(String[] args) {
		int[] A = new int[args.length];
		
		for(int i = 0; i < args.length; i++) {
			A[i] = Integer.parseInt(args[i]);
		}
		
		int max = Arrays.stream(A).max().getAsInt();
		int min = Arrays.stream(A).min().getAsInt();
		System.out.println("Average of maximum and minimum is " + (double)(max+min)/2);
	}
}
