package com.techelevator.transaction;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.techelevator.item.*;
import com.techelevator.readandwrite.*;
import com.techelevator.item.Item;


public  class FinalCart {
	
	private double cartTotal = 0;
	private Map<Item, Integer> cartMap = new LinkedHashMap<Item, Integer>();
	//private int itemQuantity = 50;
	//private Item item = (null);
	//private Map<String, Item> itemKeyName; 
	//Item item = new Item("","",0.0,50);
	
	

	//ObjectConverter objectConverter = new ObjectConverter();  **************
	
	//itemKeyName = objectConverter.mapMaker() ;
	
	
	

//	public double getCartTotal() {
//		return cartTotal;
//	}

	
	public  Map<Item, Integer> addItem (Item item, int numberOfItems) {


		//Adds to cart
		if (item.getItemQuantity() == 0 ){

			System.out.println("Sold Out.");
		
			} else if (item.getItemQuantity()  - numberOfItems >= 0) {
				cartMap.put(item, numberOfItems ); 
				item.setItemQuantity(item.getItemQuantity() - numberOfItems);// = item.getItemQuantity - numberOfItems;
			} else if (item.getItemQuantity()  - numberOfItems < 0) {
			System.out.println("There are only " + item.getItemQuantity()  + " left");
			}
		return cartMap;
		} 
	

	
//	for (Entry<String, String> entry : animalNoises.entrySet()) {
//		System.out.println("Key: " + entry.getKey());
//		System.out.println("Value: " + entry.getValue() );
//	}
	

	
	
	public double getCartTotal() {
	
		for (Entry<Item, Integer> entry : cartMap.entrySet()) {
			//costForItem is the cost of the individual item * the quantity of the item
			double costForItem= entry.getKey().getPrice()*entry.getValue();
			cartTotal += costForItem;
		}
		return cartTotal;

	}

}