public class ThirteenApplication {
	public static void main(String[] args) {
		Thirteen Car1 = new Thirteen("Ford", "1999", 23);
		Thirteen Car2 = new Thirteen("Safari", "2001", 35);
		
		System.out.printf("Final price of Car1 is %.2f%n", Car1.finalPrice(5));
		System.out.printf("Final price of Car2 is %.2f%n", Car2.finalPrice(7));
	}
}
