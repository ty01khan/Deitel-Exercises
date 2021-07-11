public class ThirtyTest {
	public static void main(String[] args) {
		Thirty policy1 = new Thirty(11111111, "Toyota Camry", "NJ");
		Thirty policy2 = new Thirty(22222222, "Ford Fusion", "LA");
		
		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);
	}
	
	public static void policyInNoFaultState(Thirty policy) {
		System.out.println("The auto policy:");
		System.out.printf("Account no.: %d; Car: %s;%nState %s %s a no-fault state%n%n", 
			policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(), (policy.isNoFaultState() ? "is" : "is not"));
	}
}
