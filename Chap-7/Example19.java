import java.util.Scanner;

public class Example19 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		boolean[] seat = new boolean[10];
		
		int cntF = 0;
		int cntE = 0;
		
		while(true) {
			System.out.print("Please type 1 for first class and type 2 for economy class: ");
			int type = inp.nextInt();
			
			if(type == 1) {
				if(cntF == 5) {
					if(cntE != 5) {
						System.out.print("All first class seats are full, if you want seat in economy class then type Yes otherwise No: ");
						String wish = inp.next();
						
						if(wish.equals("Yes")) {
							seat[cntE+5] = true;
							cntE++;
							
							System.out.printf("Seat No. = %d%nEconomy Class%n%n", cntE+5);
						}
						else {
							System.out.printf("Next flight leaves in 3 hours.%n%n");
							break;
						}
					}
					else {
						System.out.printf("All seats are full.%nNext flight leaves in 3 hours.%n%n");
						break;
					}
				}
				else {
					seat[cntF] = true;
					cntF++;
					System.out.printf("Seat No. = %d%nFirst Class%n%n", cntF);
				}
			}
			else {
				if(cntE == 5) {
					if(cntF != 5) {
						System.out.print("All economy class seats are full, if you want seat in first class then type Yes otherwise No: ");
						String wish = inp.next();
						
						if(wish.equals("Yes")) {
							seat[cntF] = true;
							cntF++;
							
							System.out.printf("Seat No. = %d%nFirst Class%n%n", cntF);
						}
						else {
							System.out.printf("Next flight leaves in 3 hours.%n%n");
							break;
						}
					}
					else {
						System.out.printf("All seats are full.%nNext flight leaves in 3 hours.%n%n");
						break;
					}
				}
				else {
					seat[cntE+5] = true;
					cntE++;
					System.out.printf("Seat No. = %d%nEconomy Class%n%n", cntE+5);
				}
			}
		}
			
	}
}
