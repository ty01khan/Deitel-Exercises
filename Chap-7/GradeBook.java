public class GradeBook {
	private String courseName;
	private int[] grades;
	
	// constructor
	public GradeBook(String courseName, int[] grades) {
		this.courseName = courseName;
		this.grades = grades;
	}
	
	// method to set the course name
	public void setName(String name) {
		this.courseName = name;
	}
	
	// method to get the course name
	public String getName() {
		return courseName;
	}
	
	public void processGrades() {
		// output grades array
		outputGrades();
		
		// call method getAverage to calcuate the average grade
		System.out.printf("%nClass average grade is: %.2f%n", getAverage());
		
		// call methods getMinimum and getMaximum
		System.out.printf("Lowest grade is %d%nHigheat grade is %d%n%n", getMinimum(), getMaximum());
		
		// call outputBarChart to print grade distribution chart
		outputBarChart();
	}
	
	public int getMinimum() {
		int lowGrade = grades[0];
		for(int grade :grades) {
			if(lowGrade > grade)
				lowGrade = grade;
		}
		
		return lowGrade;
	}
	
	public int getMaximum() {
		int highGrade = grades[0];
		for(int grade : grades) {
			if(highGrade < grade) 
				highGrade = grade;
		}
		
		return highGrade;
	}
	
	public double getAverage() {
		int total = 0;
		for(int grade : grades) {
			total += grade;
		}
		
		double avg = (double)total/grades.length;
		
		return avg;
	}
	
	public void outputBarChart() {
		System.out.println("Grade distribution:");
		
		int[] frequency = new int[11];
		for(int grade : grades) {
			frequency[grade/10]++;
		}
		
		for(int i = 0; i < frequency.length; i++) {
			if(i == 10) {
				System.out.printf("%5d: ", 100);
			}
			else {
				System.out.printf("%02d-%02d: ", i*10, i*10+9);
			}
			
			for(int stars = 0; stars < frequency[i]; stars++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void outputGrades() {
		System.out.printf("The grades are:%n%n");
		
		for(int student = 0; student < grades.length; student++) {
			System.out.printf("Student %2d: %3d%n", student+1, grades[student]);
		}
	}
}
