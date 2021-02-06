package com.techelevator.item;

import java.util.List;

public class Item {
	
	private String productName;
	private Double price;
	private String productCode;
	private int itemQuantity;
	
	
	public Item( String productCode,String name, Double price) {
		
		this.productName = name;
		this.price = price;
		this.productCode = productCode;
		this.itemQuantity =50;
		
	}


	
	public String getProductName() {
		return productName;
	}


	public Double getPrice() {
		return price;
	}


	public String getProductCode() {
		return productCode;
	}


	public int getItemQuantity() {
		return itemQuantity;
	}


	
	
	public void returnItem (int numberOfItems) {
		
//	if (itemQuantity == 0 ){
//		System.out.println("Sold Out.");
//	
//	}
		itemQuantity+=numberOfItems;
	
	}
	
	
	public void addItem (int numberOfItems) {
		
	if (itemQuantity == 0 ){
		System.out.println("Sold Out.");
	
	} else if (itemQuantity - numberOfItems >= 0) {
		itemQuantity-=numberOfItems;
	} else if (itemQuantity - numberOfItems < 0) {
		System.out.println("only " + itemQuantity + " left");
	}
	}
	
	
	
}
