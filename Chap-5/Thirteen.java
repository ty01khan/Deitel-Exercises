public class Thirteen {
	public static void main(String[] args) {
		System.out.printf("%s\t%s%n", "n", "sum");
		long sum = 0;
		for(int n = 1; n <= 100; n++) {
			sum += n;
			System.out.printf("%d\t%d%n",n,sum);
		} 
	}
}
