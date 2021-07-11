public class EncapsulationTest {
	public static void main(String[] args) {
		Encapsulation myObject = new Encapsulation();
		// myObject.name = "XYZ";
		//myObject.setName("XYZ");
		System.out.println(myObject.getName());	// error
	}
}
