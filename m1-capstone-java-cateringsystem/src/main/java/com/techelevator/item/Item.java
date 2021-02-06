package com.techelevator.item;

import java.util.List;

public class Item {
	
	private String productName;
	private double price;
	private String productCode;
	private int itemQuantity;
	
	
	public Item( String productCode,String name, double price) {
		
		this.productName = name;
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
	
	
	
	public int returnItem (int numberOfItems) {
		
	if (itemQuantity == 0 ){
		System.out.println("Sold Out.");
		}
		return itemQuantity+=numberOfItems;
		}

	
	
	public int removeItem (int numberOfItems) {
		
	if (itemQuantity == 0 ){
		System.out.println("Sold Out.");
	
		} else if (itemQuantity - numberOfItems >= 0) {
		itemQuantity-=numberOfItems;
		} else if (itemQuantity - numberOfItems < 0) {
		System.out.println("only " + itemQuantity + " left");
		}
			return 0;
	} 
	
	
	
}
