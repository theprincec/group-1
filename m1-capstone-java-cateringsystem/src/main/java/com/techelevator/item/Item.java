package com.techelevator.item;

public class Item {

	private String productName;
	private double price;
	private String productCode;
	private int itemQuantity;
	
	
	public Item( String productCode,String name, double price) {
		
		this.productName = productName;
		this.price = price;
		this.productCode = productCode;
		this.itemQuantity =50;
		
	}


	public String getProductName() {
		return productName;
	}


	public double getPrice() {
		return price;
	}


	public String getProductCode() {
		return productCode;
	}


	public int getItemQuantity() {
		return itemQuantity;
	}

	
	
	
}
