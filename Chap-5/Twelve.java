public class Twelve {
	public static void main(String[] args) {
		int product = 1;
		for(int i = 2; i <= 10; i+=2) {
			product *= i;
		}
		
		System.out.println("Product of even numbers from 2 to 10 is: " + product);
	}
}
