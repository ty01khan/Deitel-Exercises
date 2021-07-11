import java.util.Scanner;

public class Example40 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		String[] issues = {"Poverty issues", "Political issues", "Global enviromental issues", "Education system issues", "Pollution issues"};
		
		int[][] rating = new int[5][10];
		
		for(int i = 0; i < rating.length; i++) {
			for(int j = 0; j < rating[i].length; j++) {
				System.out.printf("Please rate for %s (out of 10): ", issues[i]);
				rating[i][j] = inp.nextInt();
			}
		}
		
		int maxTotal = 0, minTotal = 100, indM = 0, indm = 0;
		System.out.printf("\tIssues\t%d%3d%3d%3d%3d%3d%3d%3d%3d%3d\tAverage%n", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		for(int i = 0; i < rating.length; i++) {
			System.out.print(issues[i]);
			int total = 0;
			for(int j = 0; j < rating[i].length; j++) {
				System.out.printf("%3d", rating[i][j]);
				total += rating[i][j];
			}
			
			System.out.printf("\t%f%n", (double)total/10);
			if(total > maxTotal) {
				maxTotal = total;
				indM = i;
			}
			
			if(total < minTotal) {
				minTotal = total;
				indm = i;
			}
		}
		
		System.out.println("%nIssues\t\tHighest point total");
		System.out.printf("%s\t\t%11d%n%n", issues[indM], maxTotal);
		
		System.out.println("Issues\t\tLowest point total");
		System.out.printf("%s\t\t%11d%n", issues[indm], minTotal);
	}
}
