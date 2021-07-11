class AbstractApp {
	public static void main(String[] args) {
		// create an object of Student class which inherits attributes and methods from Abstract
		Student myObject = new Student();
		System.out.println("Name: " + myObject.fname);
		System.out.println("Age: " + myObject.age);
		System.out.println("Graduation Year: " + myObject.graduationYear);
		myObject.study();	// calling abstract method
	}
}
