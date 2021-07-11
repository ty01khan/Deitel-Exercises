public class Time1Test {
	public static void main(String[] args) {
		Time1 time = new Time1();
		
		displayTime("After time object is created", time);
		System.out.println();
		
		try {
			time.setTime(99, 99, 99);
		}
		catch (IllegalArgumentException e) {
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}
		
		displayTime("After calling setTime with invalid values", time);
		System.out.println();
		
		time.setTime(13, 24, 37);
		displayTime("After calling setTime with a valid values", time);
	}
	
	public static void displayTime(String header, Time1 t) {
		System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, t.toUniversalString(), t.toString());
	}
}
