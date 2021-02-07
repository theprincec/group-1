
package com.techelevator.readandwrite;

import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.techelevator.item.Appetizer;
import com.techelevator.item.Beverage;
import com.techelevator.item.Dessert;
import com.techelevator.item.Entree;
import com.techelevator.item.Item;
import com.techelevator.readandwrite.CsvReader;

//public class ObjectConverter {
	//public Map<String, Item> itemKeyName = new LinkedHashMap<String, Item>();
	
		
	public class ObjectConverter {
		//public Map<String, Item> itemKeyName = new LinkedHashMap<String, Item>();
		
			
		//splitting listoflines into categories
		
		
		List<String> newListOfLines = new ArrayList<String>();
		CsvReader csvReader = new CsvReader();
		
		public Map<String, Item> mapMaker() {
			
			newListOfLines = csvReader.getItemsFromFile();
			
			Map<String, Item> itemKeyName = new LinkedHashMap<String, Item>();
			
			for (String  lineItem : newListOfLines) {
				
				String[] splitItem = new String[4];
				splitItem = lineItem.split("\\|");
				
				String productCode = splitItem[0];
				String name = splitItem[1];
				Double price = Double.valueOf(splitItem[2]) ;
				
				
				
				
				//Instatiating objects from based on item type
			
				
				
				//Item item = null;
				
				if (splitItem[3].equalsIgnoreCase("A")) {
				
					Item item = new Appetizer(splitItem[0], splitItem[1], price, 0);
					itemKeyName.put(splitItem[0], item);
					
					
				} if (splitItem[3].equalsIgnoreCase("B")) {
					Item item = new Beverage(splitItem[0], splitItem[1], price, 0);
					itemKeyName.put(splitItem[0], item);
				
				} if (splitItem[3].equalsIgnoreCase("D")) {
					Item item = new Dessert(splitItem[0], splitItem[1], price, 0);
					itemKeyName.put(splitItem[0], item);
				
				} if (splitItem[3].equalsIgnoreCase("E")) {
					Item item = new Entree(splitItem[0], splitItem[1], price, 0);
					itemKeyName.put(splitItem[0], item);
				}
					
				
					//Puts Product code as key and Item as Value
				//itemKeyName.put(productCode, item);
				
				
			
					}
			
			return itemKeyName;
			
				
			}
		
		
		
	}

