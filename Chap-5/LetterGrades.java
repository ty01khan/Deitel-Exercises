import java.util.Scanner;

public class LetterGrades {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int total = 0, gradeCounter = 0, aGrades = 0, bGrades = 0, cGrades = 0, dGrades = 0, fGrades = 0;
		
		System.out.printf("%s%n%10s%n%10s%n%s%n%n%s%n", 
		"Please enter grades between 0 and 100: ",
		"Type the end-of-file indicator to terminate input",
		"On Linux/UNIX/macOS type <Ctrl> D then press Enter",
		"On Windows type <Ctrl> Z then press Enter",
		"Enter grades: ");
		
		while(inp.hasNext()) {
			int grade = inp.nextInt();
			total += grade;
			
			switch(grade / 10) {
				case 9:
				case 10:
					aGrades++;
					break;
				
				case 8:
				case 7:
					bGrades++;
					break;
					
				case 6:
					cGrades++;
					break;
				
				case 5:
				case 4:
					dGrades++;
					break;
				
				default:
					fGrades++;
					break;
			}
			
			gradeCounter++;
		}
		
		System.out.printf("%nGrade Report:%n");
		
		if(gradeCounter != 0) {
			double average = (double) total/gradeCounter;
			
			System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
			System.out.printf("Class average is %.2f%n%n", average);
			
			System.out.printf("%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", 
			"Number of students who received each grade: ",
			"A: ", aGrades,
			"B: ", bGrades,
			"C: ", cGrades,
			"D: ", dGrades,
			"F: ", fGrades);
		}
		else
			System.out.println("No grades were entered");
	}
}
