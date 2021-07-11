public class EighteenOval {
	
	public static void main (String[] args) {
		for(int i = 1; i <= 9; i++) {
			if (i == 1 || i == 9)
				System.out.println("   ***   ");
			else if (i == 2 || i == 8)
				System.out.println(" *     * ");
			else
				System.out.println("*       *");
		}
	}
}
