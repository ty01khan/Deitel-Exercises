public class Thirteen {
	String model;
	String year;
	double price;
	
	public Thirteen(String model, String year, double price) {
		this.model = model;
		this.year = year;
		
		if(price > 0.0) {
			this.price = price;
		}
	}
	
	public double finalPrice(double discount) {
		return price*(1 - discount/100);
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getYear() {
		return year;
	}
	
	public double getPrice() {
		return price;
	}
}
