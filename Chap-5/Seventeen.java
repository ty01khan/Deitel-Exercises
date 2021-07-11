import java.util.Scanner;

public class Seventeen {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int aGrades = 0, bGrades = 0, cGrades = 0, dGrades = 0;
		String name, grade;
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Please enter student %d name: ", i+1);
			name = inp.nextLine();
			
			System.out.printf("Please enter grade: ", i+1);
			grade = inp.nextLine();
			
			switch(grade) {
				case "A":
					aGrades++;
					break;
				
				case "B":
					bGrades++;
					break;
				
				case "C":
					cGrades++;
					break;
				
			    default:
					dGrades++;
					break;
			}
		}
		
		System.out.println("No. of students who got A grade = " + aGrades);
		System.out.println("No. of students who got B grade = " + bGrades);
		System.out.println("No. of students who got C grade = " + cGrades);
		System.out.println("No. of students who got D grade = " + dGrades);
	}
}
