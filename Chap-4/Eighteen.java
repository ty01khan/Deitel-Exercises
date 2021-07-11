import java.util.Scanner;

public class Eighteen {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int cnt = 1;
		
		System.out.printf("Please enter customer-%d details or -1 to exit: ",cnt);
		int acn = inp.nextInt();
		
		if(acn == -1) {
			System.out.println("No Customer added!");
			return;
		}
			
		System.out.printf("Initial balance: ");
		int inb = inp.nextInt();
		
		System.out.printf("All items charges: ");
		int charges = inp.nextInt();
		
		System.out.printf("All credits: ");
		int credits = inp.nextInt();
		
		System.out.printf("Credit limit: ");
		int credLim = inp.nextInt();
		
		int balance;
			
		while(acn != -1) {
			cnt++;
			balance = inb + charges - credits;
			System.out.println("New balance is " + balance);
			
			if(balance > credLim)
				System.out.println("\nCredit limit exceeded\n");
			else
				System.out.println("");
				
			System.out.printf("Please enter customer-%d details or -1 to exit: ",cnt);
		    acn = inp.nextInt();
			
			if(acn == -1)
				break;
			
			System.out.printf("Initial balance: ");
			inb = inp.nextInt();
			
			System.out.printf("All items charges: ");
			charges = inp.nextInt();
			
			System.out.printf("All credits: ");
			credits = inp.nextInt();
			
			System.out.printf("Credit limit: ");
			credLim = inp.nextInt();
		}
	}
}
