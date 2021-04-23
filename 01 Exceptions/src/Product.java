public class Product {
	private String name;
	private double price;
	
	public Product(String name, double price) {
		if(price < 0) {
			throw new IllegalArgumentException(); // cause a runtime exception
		}
		
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name + " $" + price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	// we may need this because prices can change
	// Note that in the real world we wouldn't want setting the price to be public to everyone
	public void setPrice(double price) {
		if(price > 0) {
			this.price = price;
		}
	}
}
