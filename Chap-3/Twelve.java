public class Twelve {
	private String location;
	private String pType;
	private int quantity;
	private double price;
	private double discount;
	
	public Twelve(String location, String pType, int quantity, double price, double discount) {
		this.location = location;
		this.pType= pType;
		
		if(quantity > 0.0) {
			this.quantity = quantity;
		}
		
		if(price > 0.0) {
			this.price = price;
		}
		
		if(discount > 0.0) {
			this.discount = discount;
		}
		
	}
	
	public double getPurchaseAmount() {
		return (quantity*price)*(100 - discount)/100;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setType(String pType) {
		this.pType = pType;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getType() {
		return pType;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getDiscount() {
		return discount;
	}
}
