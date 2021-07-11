
public class StaticEmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Employee before instantiation: %d%n", StaticEmployee.getCount());
		
		StaticEmployee e1 = new StaticEmployee("Talha", "Yaseen");
		StaticEmployee e2 = new StaticEmployee("Abhinav", "Singh");
		
		System.out.printf("%nEmployee after instantiation:%n");
		System.out.printf("via e1.getCount(): %d%n", e1.getCount());
		System.out.printf("via e2.getCount(): %d%n", e2.getCount());
		System.out.printf("via Employee.getCount(): %d%n", StaticEmployee.getCount());
		
		System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n", e1.getFirstName(), e1.getLastName(), e2.getFirstName(), e2.getLastName());
		
	}

}
