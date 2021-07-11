import java.util.Scanner;

public class FourteenApplication {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int hour = inp.nextInt();
		int minute = inp.nextInt();
		int second = inp.nextInt();
		
		Fourteen time = new Fourteen(hour, minute, second);
		time.setHour(hour);
		time.setMinute(minute);
		time.setSecond(second);
		time.displayTime();
	}
}
