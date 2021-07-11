public class Thirty {
	private int accountNumber;
	private String makeAndModel;
	private String state;
	
	// Constructor
	public Thirty (int accountNumber, String makeAndModel, String state) {
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		setState(state);
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setMakeAndModel(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}
	
	public String getMakeAndModel() {
		return makeAndModel;
	}
	
	public void setState(String state) {
		if(state == "MA" || state == "NJ" || state == "NY" || state == "PA" || state == "CT" || state == "MA" || state == "ME/" || state == "NH" || state == "VT")
			this.state = state;
		else
		System.out.println("Not a valid state name");
	}
	
	public String getState() {
		return state;
	}
	
	// predicate method returns whether the state has no-fault insurance
	public boolean isNoFaultState() {
		boolean noFaultState;
		
		switch(getState()) {
			case "MA": 
			case "NJ": 
			case "NY": 
			case "PA": 
			case "CT":
			case "ME": 
			case "NH": 
			case "VT":
				noFaultState = true;
				break;
			
			default:
				noFaultState = false;
				break;
		}
		
		return noFaultState;
	}
}
