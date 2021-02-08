package com.techelevator.item;

import java.util.List;

public class Item {
	
	public String productName;
	public Double price;

	public String productCode;
	public int itemQuantity = 50;
	
	

	public Item( String productCode,String name, Double price, int itemQuantity) {

		
		this.productName = name;
		this.price = price;
		this.productCode = productCode;
		this.itemQuantity = 50;
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
	
	
	
	/*
	public int returnItem (int numberOfItems) {
		

	if (itemQuantity == 0 ){
		System.out.println("Sold Out.");
		}
		return itemQuantity+=numberOfItems;
		}
*/

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}






	public String addItem (int numberOfItems) {

		if (itemQuantity == 0 ){
			System.out.println("Sold Out.");
		
			} else if (itemQuantity - numberOfItems >= 0) {
			itemQuantity-=numberOfItems;
			} else if (itemQuantity - numberOfItems < 0) {
			System.out.println(" only " + itemQuantity + " left ");
			}
				return "";
		} 
	
	
	
}
