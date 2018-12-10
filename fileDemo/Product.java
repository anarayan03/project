package fileDemo;

import java.io.Serializable;

public class Product implements Serializable
{
	public int productId;
	public String productName;
	public long productPrice;
	
	public Product(int productId, String productName, long productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	
}
