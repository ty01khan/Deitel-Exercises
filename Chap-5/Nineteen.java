public class Nineteen {
	public static void main(String[] args) {
		int x = 4, y = 9, z = -12;
		System.out.println(x==4);
		System.out.println(y != 9);
		System.out.println((x <= 0) || (z <= 0));
		System.out.println((y <= 4) | (x <= 0));
		System.out.println((x <= z) && (y >= z));
		System.out.println((x + y <= 12) & (y + z < x));
		System.out.println(!((x + 5) > 10));
	}
}
