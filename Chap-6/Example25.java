public class Example25 {
	public static void main(String[] args) {
		System.out.print("Prime numbers are: " + 2 + " ");
		for(int i = 3; i <= 100; i+=2) {
			if(isPrimeSqrt(i))
				System.out.print(i + " ");
		}
	}
	
	public static boolean isPrime(int n) {
		int i;
		for(i = 2; i <= n/2; i++) {
			if(n % i == 0)
				break;
		}
		
		return (n/2 + 1 == i) ? true : false;
	}
	
	public static boolean isPrimeSqrt(int n) {
		int i;
		for(i = 2; i <= (int)Math.ceil(Math.sqrt(n)); i++) {
			if(n % i == 0)
				break;
		}
		
		return ((int)Math.ceil(Math.sqrt(n)) + 1 == i) ? true : false;
	}
}
