import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Sixteen {
	String fname;
	String lname;
	String dob;
	
	public Sixteen(String fname, String lname, String dob) {
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public void setDOB(String dob) {
		this.dob = dob;
	}
	
	public String getFname() {
		return fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public String getDOB() {
		return dob;
	}
	
	public long findAge(Date date) {
		Instant ins = date.toInstant();
		ZonedDateTime zone = ins.atZone(ZoneId.systemDefault());
		LocalDate givenDate = zone.toLocalDate();
		
		Period period = Period.between(givenDate, LocalDate.now());
		 
		return period.getYears();
	}
	
	public long maxHeartRate(long age) {
		return 220 - age;
	}
	
	public double minRange(long maxRate) {
		return 0.5*maxRate;
	}
	
	public double maxRange(long maxRate) {
		return 0.85*maxRate;
	}
}

