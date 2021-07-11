import java.math.BigDecimal;
import java.text.NumberFormat;

public class BigDecimalInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal principal = BigDecimal.valueOf(1000.0);
		BigDecimal rate = BigDecimal.valueOf(0.05);
		
		System.out.printf("%s%20s%n", "Year", "Amount on deposit");
		
		// amount = principal*(1 + rate)^year;
		for(int year = 1; year <= 10; year++) {
			BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));
			System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
		}
	}
}
