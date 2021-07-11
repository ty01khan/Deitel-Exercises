// abstract class
abstract class Abstract {
	public String fname = "XYZ";
	public int age = 21;
	public abstract void study();
}

// subclass (inherit from Abstract)
class Student extends Abstract {
	public int graduationYear = 2021;
	
	// the body of the abstract method is provided here
	public void study() {
		System.out.println("My name is: " + fname + "\nMy graduation year is " + graduationYear);
	}
}
