
public class Cone {
	private double radius, height;
	
	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public double getHeight() {
		return height;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area() {
		return Math.PI * radius * (radius + Math.sqrt(height * height 
				+ radius * radius));
	}
	
	public double volume() {
		return Math.PI * radius * radius * height / 3.0;
	}
	
	@Override
	public String toString() {
		return "radius: " + radius + ", height: " + height;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Cone) {
			Cone c = (Cone) obj;
			return radius == c.radius && height == c.height;
		}
		return false;
	}

	public static void main(String[] args) {
		Cone c1 = new Cone(4.0, 5.0);
		Cone c2 = new Cone(4.0, 5.0);
		Cone c3 = new Cone(8.0, 10.0);
		
		System.out.println(c1);
		System.out.println(c1 == c2); // false, comparing reference values
		System.out.println(c1.equals(c2)); // true, comparing properties
	}
}
