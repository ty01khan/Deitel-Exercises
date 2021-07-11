public class Fourteen {
	int hour;
	int minute;
	int second;
	
	public Fourteen(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void setHour(int hour) {
		if(hour > 23)
			this.hour = 0;
		else
			this.hour = hour;
	}
	
	public void setMinute(int minute) {
		if(minute > 59)
			this.minute = 0;
		else
			this.minute = minute;
	}
	
	public void setSecond(int second) {
		if(second > 59)
			this.second = 0;
		else
			this.second = second;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void displayTime() {
		if(hour < 10 && minute < 10 && second < 10)
			System.out.printf("Time is: 0%d:0%d:0%d%n", hour, minute, second);
		else if(hour < 10 && minute < 10 && second > 10)
			System.out.printf("Time is: 0%d:0%d:%d%n", hour, minute, second);
		else if(hour < 10 && minute > 10 && second < 10)
			System.out.printf("Time is: 0%d:%d:0%d%n", hour, minute, second);
		else if(hour > 10 && minute < 10 && second < 10)
			System.out.printf("Time is: %d:0%d:0%d%n", hour, minute, second);
		else if(hour < 10 && minute > 10 && second > 10)
			System.out.printf("Time is: 0%d:%d:%d%n", hour, minute, second);
		else if(hour > 10 && minute < 10 && second > 10)
			System.out.printf("Time is: %d:0%d:%d%n", hour, minute, second);
		else if(hour < 10 && minute < 10 && second < 10)
			System.out.printf("Time is: %d:%d:0%d%n", hour, minute, second);
		else
			System.out.printf("Time is: %d:%d:%d%n", hour, minute, second);
	}
}
