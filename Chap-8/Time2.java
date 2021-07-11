
public class Time2 {
	private int hour;	// 0 - 23
	private int minute;	// 0 - 59
	private int second;	// 0 - 59
	
	// Time2 no-argument constructor:
	// initializes each instance variable to zero
	public Time2() {
		this(0, 0, 0);	// invoke Time2 constructor with three arguments
	}
	
	// Time2 constructor : hour supplied, others arguments defaulted to zero
	public Time2(int hr) {
		this(hr, 0, 0);
	}
	
	// Time2 constructor : hour and minute supplied, other argument defaulted to zero
	public Time2(int hr, int min) {
		this(hr, min, 0);
	}
	
	// Time2 constructor : all arguments supplied
	public Time2(int hr, int min, int sec) {
		setTime(hr, min, sec);
	}
	
	// Time2 constructor : another Time2 object supplied
	public Time2(Time2 t) {
		this(t.getHour(), t.getMinute(), t.getSecond());
	}
	
	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	public void setHour(int h) {
		if(h >= 0 && h <= 23) {
			hour = h;
		}
		else {
			throw new IllegalArgumentException("hour must be 0-23");
		}
	}
	
	public void setMinute(int m) {
		if(m >= 0 && m <= 59) {
			minute = m;
		}
		else {
			throw new IllegalArgumentException("minute must be 0-59");
		}
	}
	
	public void setSecond(int s) {
		if(s >= 0 && s <= 59) {
			second = s;
		}
		else {
			throw new IllegalArgumentException("second must be 0-59");
		}
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
	
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}
	
	public void tick() {
		if(second == 59) {
			if(minute == 59) {
				if(hour == 23) {
					hour = 0;
				}
				else {
					setHour(++hour);
				}
				minute = 0;
			}
			else {
				setMinute(++minute);
			}
			second = 0;
		}
		else {
			setSecond(++second);
		}
	}
	
	public void incrementMinute() {
		if(minute == 59) {
			if(hour == 23) {
				hour = 0;
			}
			else {
				setHour(++hour);
			}
			minute = 0;
		}
		else {
			setMinute(++minute);
		}
	}
	
	public void incrementHour() {
		if(hour == 23) {
			hour = 0;
		}
		else {
			setHour(++hour);
		}
	}
}
