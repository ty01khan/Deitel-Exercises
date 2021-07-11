import java.util.Scanner;

public class ThirtyOne {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int cnt = 0;
		
		System.out.printf("All questions taken from https://www.sanfoundry.com/environment-management-questions-answers-global-warming/%n%n");
		
		System.out.printf("\tAll questions are compulsory%nJust type 'a' or 'b' or 'c' or 'd' to answer the questions%n%n");
		
		// Question 1
		System.out.printf("Question 1: Which one of the following cause global warming?%n\ta) Carbon dioxide%n\tb) Oxygen%n\tc) Nitrogen%n\td) Hydrogen%n");
		
		System.out.printf("Please enter the correct option: ");
		char ans = inp.next().charAt(0);
		
		if(Character.compare(ans, 'a') == 0)
		cnt++;
		
		// Question 2
		System.out.println("\nQuestion 2: How many percent of carbon dioxide increased in the atmosphere since pre-industrial times?");
		System.out.println("        a) About 10%");
		System.out.println("        b) About 20%");
		System.out.println("        c) About 30%");
		System.out.println("        d) About 40%");
		
		System.out.printf("Please enter the correct option: ");
		ans = inp.next().charAt(0);
		
		if(Character.compare(ans, 'c') == 0)
		cnt++;
		
		// Question 3
		System.out.printf("%nQuestion 3: What is the full form of UNFCC with respect to global warming convention?%n\ta) United Nations Framework Convention on Climate Change%%n\tb) United Nations Federation Convention on Climate Change%n\tc) United Nations Framework Center on Climate Change%n\td) United Nations Framework Center on Climate Change%n");
		
		System.out.printf("Please enter the correct option: ");
		ans = inp.next().charAt(0);
		
		if(Character.compare(ans, 'a') == 0)
		cnt++;
		
		// Question 4
		System.out.printf("%nQuestion 4: Who measures the global warming rate?%n\ta) Astrologers%n\tb) Physicist%n\tc) Philosopher%n\td) Climatologist%n");
		
		System.out.printf("Please enter the correct option: ");
		ans = inp.next().charAt(0);
		
		if(Character.compare(ans, 'd') == 0)
		cnt++;
		
		// Question 5
		System.out.printf("%nQuestion 5: Which one of the following result takes place due to global warming?%n\ta) Maintaining steady temperature%n\tb) Changes in the rainfall%n\tc) Pleasant environment%n\td) Causing less pollution%n");
		
		System.out.printf("Please enter the correct option: ");
		ans = inp.next().charAt(0);
		
		if(Character.compare(ans, 'b') == 0)
		cnt++;
		
		if(cnt == 5)
		System.out.printf("%nExcellent, Your marks is %d/5%n%n", cnt);
		else if(cnt == 4)
		System.out.printf("%nVery good, Your marks is %d/5%n%n", cnt);
		else
		System.out.printf("%nTime to brush up on your knowledge of global warming, Your marks is %d/5%n%n", cnt);
		
		System.out.printf("Explanation:%n");
		System.out.printf("Question 1: Correct answer is option a%nExplanation: About 75 percent of the solar energy reaching the earth is absorbed by the earth’s surface the rest of the heat radiate back to the atmosphere. Some of the heat is trapped by greenhouse gases as carbon dioxide which is released by various human activities.%n%n");
		
		System.out.printf("Question 2: Correct answer is option c%nExplanation: The carbon dioxide in the atmosphere has increased about 30 percent since pre-industrial times. It causing more heat to trapped in the lower atmosphere. Human activities, industrialization and population growth are the main reasons.%n%n");
		
		System.out.printf("Question 3: Correct answer is option a%nExplanation: In order to control the continuous increase in the carbon dioxide level many countries have signed a convention to reduce greenhouse gas under the United Nationals Framework Convention on Climate Change (UNFCC).%n%n");
		
		System.out.printf("Question 4: Correct answer is option d%nExplanation: Global warming is usually calculated by climatologist. Global warming is accelerating faster than that calculated by climatologists. It was predicted in 1995 that in 21st century there would be raise in temperature by 3.5 to 10 degree Celsius.%n%n");
		
		System.out.printf("Question 5: Correct answer is option b%nExplanation: Global warming leads to changes in temperature and also changes the amount of rainfall and causes various problems. These fluctuations in rainfall cause various problems and leading to either floods or droughts.%n%n");
	}
}
