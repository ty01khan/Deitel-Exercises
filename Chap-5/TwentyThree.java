public class TwentyThree {
	public static void main(String[] args) {
		int x = 10, y = 12;
		
		// (a).
		System.out.println(!(x < 5) && !(y >= 7));
		System.out.println(!((x < 5) || (y >= 7)));	// De Morgan's Laws
		
		// (b).
		System.out.println(!(x == y) || !(x != 5));
		System.out.println(!((x == y) && (x != 5)));	// De Morgan's Laws
		
		// (c).
		System.out.println(!((x <= 8) && (y > 4)));
		System.out.println(!(x <= 8) || !(y > 4));	// De Morgan's Laws
		
		// (d).
		System.out.println(!((x > 4) || (y <= 6)));
		System.out.println(!(x > 4) && !(y <= 6));  // De Morgan's Laws
	}
}
