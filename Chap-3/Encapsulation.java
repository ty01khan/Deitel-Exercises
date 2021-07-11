// sensitive data is hidden from users (implement get() and set() methods to access it)

public class Encapsulation {
	private String name = "XYZ1"; 	// private = access is restricted
	
	// Getter method
	public String getName() {
		return name;
	}
	
	// Setter
	public void setName(String newName) {
		this.name = newName;
	}
}
