public class Product {
	private final String productName;
	private final Double price;
	private final Integer quantity;

	public Product(String productName, Double price, Integer quantity) {
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}

//    Implement this static function 
	public static Double calculateTotalPrice(Product...products ) {
		double sum = 0.0;
		for (Product prod : products) {
			sum += prod.price;
		}
		return sum;
	}

	public static void main(String[] args) {
		Product product1 = new Product("Laptop", 1500.00, 1);
		Product product2 = new Product("Mouse", 50.00, 2);
		Product product3 = new Product("Keyboard", 150.00, 1);
		Product product4 = new Product("Phone", 800.00, 1);
		// Attempt to modify (this should not be easily possible)
		// product1.price = 1000.00; // This might not compile or have no effect
		Double total = calculateTotalPrice(product1, product2, product3);
		System.out.println("Total Price: " + total);
	}
}