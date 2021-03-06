package com.productapp.model.persistence;

import java.sql.Date;
import java.time.LocalDate;

public class Product {

	int productId;
	String name;
	double price;
	int quantity;
	Date manufacture_date;
	Date inspection_date;
	
	
	
	public Product(int productId, String name, double price, int quantity, Date manufacture_date,
			Date inspection_date) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.manufacture_date = manufacture_date;
		this.inspection_date = inspection_date;
	}
	
	public Product(String name, double price, int quantity, Date manufacture_date,
			Date inspection_date) {
		super();
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.manufacture_date = manufacture_date;
		this.inspection_date = inspection_date;
	}





	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getManufacture_date() {
		return manufacture_date;
	}
	public void setManufacture_date(Date manufacture_date) {
		this.manufacture_date = manufacture_date;
	}
	public Date getInspection_date() {
		return inspection_date;
	}
	public void setInspection_date(Date inspection_date) {
		this.inspection_date = inspection_date;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ ", manufacture_date=" + manufacture_date + ", inspection_date=" + inspection_date + "]";
	}
	
	
	
	
}
