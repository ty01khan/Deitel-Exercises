public class ThirtySevenB {
	public static void main(String[] args) {
		float e = 0;
		ThirtySevenA obj = new ThirtySevenA();
		for(int i = 0; i <= 10; i++) {
			e += (float)1/(obj.fact(i));
		}
		System.out.println("e = " + e);
	}
}
