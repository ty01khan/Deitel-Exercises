import java.util.*;

public class Seventeen {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int tripCnt = 1;
		int totMiles = 0;
		int totGallons = 0;
		
		System.out.printf("Please enter miles driven in trip %d or -1 to quit: ", tripCnt);
		int milesDriven = inp.nextInt();
		
		System.out.printf("Please enter gallons used in trip %d or -1 to quit: ", tripCnt);
		int gallonsUsed = inp.nextInt();
		float mpg;
		
		while(milesDriven != -1 && gallonsUsed != -1) {
			mpg = (float)milesDriven/gallonsUsed;
			System.out.printf("\nMiles per gallon in trip %d is %.2f \n\n", tripCnt, mpg);
			
			tripCnt++;
			totMiles += milesDriven;
			totGallons += gallonsUsed;
			
			System.out.printf("Please enter miles driven in trip %d or -1 to quit: ", tripCnt);
			milesDriven = inp.nextInt();
			
			System.out.printf("Please enter gallons used in trip %d or -1 to quit: ", tripCnt);
		    gallonsUsed = inp.nextInt();
		}
		
		float totMPG = (float)totMiles/totGallons;
		System.out.printf("\nMiles per gallon in whole trip is %.2f \n", totMPG);
	}
}
