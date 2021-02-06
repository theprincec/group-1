package com.techelevator.readandwrite;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.techelevator.item.Appetizer;
import com.techelevator.item.Beverage;
import com.techelevator.item.Dessert;
import com.techelevator.item.Entree;
import com.techelevator.item.Item;
import com.techelevator.readandwrite.CsvReader;

public class ObjectConverter {
	//public Map<String, Item> itemKeyName = new LinkedHashMap<String, Item>();
	
		
	//splitting listoflines into categories
	
	

	public Map<String, Item> objConverter(List<String>listOfLines) {
	Map<String, Item> itemKeyName = new LinkedHashMap<String, Item>();
	for (String  lineItem: listOfLines) {
		
		String[] splitItem = new String[4];
		splitItem = lineItem.split("|");
		
		String productCode = splitItem[0];
		String price = (splitItem[2]) ;
		String name = splitItem[1];
		
		
		//Instatiating objects from based on item type
	
		
		
		Item item = null;
		
		if (splitItem[3].equals("A")) {
		
			item = new Appetizer(productCode, name, price);
		
		} if (splitItem[3].equals("B")) {
			item = new Beverage(productCode, name, price);
		
		} if (splitItem[3].equals("D")) {
			item = new Dessert(productCode, name, price);
		
		} if (splitItem[3].equals("E")) {
			item = new Entree(productCode, name, price);
		}
			
		
			//Puts Product code as key and Item as Value
		itemKeyName.put(productCode, item);
		
		
	
			}
	
	return itemKeyName;
		
			
		}
	
	
		
	
}
