package com.techelevator.item;

import java.util.ArrayList;
import java.util.List;

public class TemporaryCart {
	
	private static int count = 50;
	private Item item;
	
	
	
	
	List<String> Cart = new ArrayList<String>(); 
		
	
	public List<String> addToCart ( int itemQuantity, String productCode) {
		Cart.add(itemQuantity, productCode);
		
		return Cart;
		
	}
	
	
	
	public TemporaryCart (Item item) {
		this.item = item;
	}
	

		
	public Item getItem() {
		return item;
	}
	
	
	
}
