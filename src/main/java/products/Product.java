package products;

public class Product {
	private String productNumber;
	private String productName;
	private int stock;

	public Product() {
	}

	public Product(String productNumber, String productName, int stock) {
		this.productNumber = productNumber;
		this.productName = productName;
		this.stock = stock;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
