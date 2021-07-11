import java.util.Scanner;

public class Ninteen {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		float totValue = 0;
		int cnt = 1;
		
		System.out.printf("Please enter value-%d or -1 to exit: ",cnt);
		float value = inp.nextFloat();
		
		if(value == -1) {
			System.out.println("\nNo items sold\n");
			return;
		}
		
		while(value != -1) {
			totValue += value;
			cnt++;
			
			System.out.printf("Please enter value-%d or -1 to exit: ",cnt);
			value = inp.nextFloat();
			
			if(value == -1) {
				break;
			}
		}
		
		System.out.printf("\nEarning is %.2f\n", (200 + totValue*0.09));
	}
}
