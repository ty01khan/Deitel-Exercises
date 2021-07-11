public class Example16 {
	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {
			int a = Math.abs(Integer.parseInt(args[i]));
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
