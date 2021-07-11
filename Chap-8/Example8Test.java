
public class Example8Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date(1, 1, 2020);
		for(int i = 0; i < 84; i++) {
			d.nextDay();
			System.out.println(d.toString());
		}
	}

}
