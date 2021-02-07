package com.techelevator.transaction;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import com.techelevator.item.*;
import com.techelevator.readandwrite.*;
import com.techelevator.item.Item;


public  class FinalCart {
	
	private Map<Item, Integer> cartMap = new LinkedHashMap<Item, Integer>();
	private int itemQuantity;
	//private Map<String, Item> itemKeyName; 
	
	

	//ObjectConverter objectConverter = new ObjectConverter();  **************
	
	//itemKeyName = objectConverter.mapMaker() ;
	
	
	
	public int getItemQuantity() {
		return itemQuantity;
	}

//	public Map<Item, Integer> addToCart ( int itemQuantity, String productCode) {
//		//cartList = map of object, and quantity
//		cartList.put(getItem(),itemQuantity );
//		return cartList;
//		
//	}

	public  Map<Item, Integer> addItem (Item item, int numberOfItems) {

		if (item.getItemQuantity() == 0 ){
			System.out.println("Sold Out.");
		
			} else if (item.getItemQuantity()  - numberOfItems >= 0) {
				cartMap.put( item, numberOfItems ); 
				itemQuantity-=numberOfItems;
			} else if (item.getItemQuantity()  - numberOfItems < 0) {
			System.out.println("There are only " + item.getItemQuantity()  + " left");
			}
				return cartMap;
		} 
	
	
	
//public void addItem(Item item, int quantity) {
//		
//		if (item == null || quantity < 1 ) {
//			return;
//		}
//		
//		if (cartMap.containsKey(item)) {
//			
//			cartMap.replace(item, cartMap.get(item) + quantity);
//			
//		} else {
//			
//			cartMap.put(item, quantity);
//			
//		}
//	
	
	
	
	
	//ONCE WE ADD ABOVE METHODS RETURN MODIFIED CARTMAP
	public Map<Item, Integer> getCart(){
		return this.cartMap;
	}
	
}