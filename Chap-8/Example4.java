import static java.lang.Math.*;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder cylinder = new Cylinder(2, 3);
		
		System.out.printf("Volume of cylinder = %.2f", cylinder.volume());
	}

}

class Cylinder {
	private int radius = 1;
	private int height = 1;
	
	public Cylinder(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}
	
	public void setRadius(int radius) {
		if(radius < 0) {
			System.out.println("Radius is negative");
			return;
		}
		else {
			this.radius = radius;
		}
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setHeight(int height) {
		if(height < 0) {
			System.out.println("Hegith is negative");
			return;
		}
		else {
			this.height = height;
		}
	}
	
	public int getHeight() {
		return height;
	}
	
	public double volume() {
		return PI*pow(radius, 2)*height;
	}
}
