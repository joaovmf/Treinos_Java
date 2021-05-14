package entities;

import java.util.Date;

public class Order {

	private Date date;
	private GetSetProduct2 product;
	
	public Order(Date date, GetSetProduct2 product) {
		super();
		this.date = date;
		this.product = product;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public GetSetProduct2 getProduct() {
		return product;
	}

	public void setProduct(GetSetProduct2 product) {
		this.product = product;
	}
	
	
	
	
}
