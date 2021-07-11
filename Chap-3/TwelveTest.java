import java.util.*;

public class TwelveTest {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.printf("Please enter the station's location: ");
		String location = inp.nextLine();
		
		System.out.printf("Please enter the type of petrol: ");
		String pType = inp.nextLine();
		
		System.out.printf("Please enter the quantity of petrol: ");
		int quantity = inp.nextInt();
		
		System.out.printf("Please enter the price of petrol: ");
		double price = inp.nextDouble();
		
		System.out.printf("Please enter the percentage discount: ");
		double discount = inp.nextDouble();
		
		Twelve party1 = new Twelve(location, pType, quantity, price, discount);
		
		System.out.printf("%nNet amount = %.2f%n", party1.getPurchaseAmount());
	}
}
