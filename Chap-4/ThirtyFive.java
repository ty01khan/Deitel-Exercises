public class ThirtyFive {
	public static void main(String[] args) {
		int y = 10;
		int x = ++ ++y;
		System.out.println("\nx = " + x);
	}
	
	// Output: Error (because y is a value, not variable)
}
