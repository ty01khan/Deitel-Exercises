import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class SixteenApp {
	public static Date StringToDate(String dob) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date date = formatter.parse(dob);
		System.out.println("Date object value: " + date);
		return date;
	}	
	public static void main(String[] args) throws ParseException {
		Scanner inp = new Scanner(System.in);
		
		System.out.printf("First name: ");
		String fname = inp.nextLine();
		
		System.out.printf("Last name: ");
		String lname = inp.nextLine();
		
		System.out.printf("Date of Birth (dd-MM-yyyy): ");
		String dob = inp.nextLine();
		
		Sixteen HeartRate = new Sixteen(fname, lname, dob);
		
		long age, maxRate;
		double minRange, maxRange;
		Date date;
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		date = formatter.parse(dob);
		
		age = HeartRate.findAge(date);
		maxRate = HeartRate.maxHeartRate(age);
		minRange = HeartRate.minRange(maxRate);
		maxRange = HeartRate.maxRange(maxRate);
		
		System.out.println("Person age is " + age);
		System.out.println("Maximum Heart rate is " + maxRate);
		System.out.println("Heart rate range is [" + minRange + "," + maxRange + "]");
	}
}
