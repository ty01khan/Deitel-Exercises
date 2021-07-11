class PackageData {
	int num = 0;
	String str = "Hello";
	
	public String toString() {
		return String.format("number: %d; string: %s", num, str);
	}
}

public class PackageDataTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PackageData pd = new PackageData();
		System.out.printf("After instantiation: %n%s%n", pd);
		
		pd.num = 44;
		pd.str = "Good Bye";
		
		System.out.printf("%nAfter changing data:%n%s%n", pd);
	}
}