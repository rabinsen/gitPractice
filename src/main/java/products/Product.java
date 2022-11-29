package products;

public class Product {
	private String productNumber;
	private String productName;
	private String productCategory;
	private String maker;
	private int stock;


	public Product() {
	}

	public Product(String productNumber, String productName, String productCategory, String maker, int stock) {
		this.productNumber = productNumber;
		this.productName = productName;
		this.productCategory = productCategory;
		this.maker = maker;
		this.stock = stock;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
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

	@Override
	public String toString() {
		return "Product{" +
				"productNumber='" + productNumber + '\'' +
				", productName='" + productName + '\'' +
				", productCategory='" + productCategory + '\'' +
				", maker='" + maker + '\'' +
				", stock=" + stock +
				'}';
	}
}
