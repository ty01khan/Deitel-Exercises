import java.util.Scanner;

public class Example28 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Please enter temperature (in degree celcius): ");
		int temp = inp.nextInt();
		
		sportsRecommender(temp);
	}
	
	public static void sportsRecommender(int t) {
		if(t >= 10 && t <= 40) {
			if(t >= 20 && t <= 30)
				System.out.println("It's lovely weather for sports today");
			else
				System.out.println("It's reasonable weather for sports today");
		}
		else
		System.out.println("Please exercise with care today, watch out for the weather!");
	}
}
