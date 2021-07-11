import java.util.Scanner;

public class Twenty {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int cnt = 1, earn;
		String name;
		float tax;
		
		while(cnt <= 3) {
			System.out.printf("Please enter citizen-%d name and earning (in $): ", cnt);
			name = inp.nextLine();
			earn = inp.nextInt();
			
			if(earn > 30000) {
				tax = (float)earn*20/100;
				System.out.println("Tax = " + tax);
			}
			else {
				tax = (float)earn*15/100;
				System.out.println("Tax = " + tax);
			}
			
			cnt++;
			System.out.println("");
		}
	}
}
