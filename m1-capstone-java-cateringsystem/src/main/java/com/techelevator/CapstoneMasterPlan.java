package com.techelevator;

public class CapstoneMasterPlan {

	
//com.techelevator
	//CateringSystemCLI
	/*
	 * 1. Instantiates all classes and runs the program
	 */
	
	
//com.techelevator.view
	//Menu
	/*
	 * Takes user through possible options and displays 
	 * 		1.prompts user for input
	 * 		2. displays possibleItems and allows user to make selection
	 * 			- asks user for selection
	 * 			- asks user for quantity
	 * 			- asks for a deposit
	 * 		3. adds userSelections to cart(may have to make new class) or transaction
	 */
	
	
//com.techelevator.item
	//Item
	/*
	 * 1. SuperClass of all items with parameters of (productCode, productName, price, itemQuantity) 
	 * 2. Need getters for (productcode, productName, price) and add to Transaction
	 */
	
	//Appetizer
	/*
	 * Extends Item
	 */
	
	//Beverage
	/*
	 * Extends Item
	 */
	
	//Dessert
	/*
	 * Extends Item
	 */
	
	//Entree
	/*
	 * Extends Item
	 */
	
	//TemporaryCart (possibly needed for when requested item quantity is more than left or in stock)
	/*
	 * -----Calls getProductName and getItemQuantity-----
	 * 
	 * 1. Where we calculate quantity 
	 * 		if (count == 0 ){
			throw new Exception("Item is Sold Out. ");
		} else if (count - numberOfItems >= 0) {
			count-=numberOfItems;
		} else {
			throw new Exception("Sorry we only have " + count + " left. Try again. ");
	 * 2.
	 */
	
	
	
	
//com.techelevator.readandwrite
	//CsvReader
	/*
	 * 1. Read cateringsystem.csv and print its "Menu" to the user
	 */
	
	
	//FilesIn
	/*
	 * 1. Not sure
	 */
	
	
	//ItemSplitter
	/*
	 * 1.Where we read "cateringsystem.csv and use a charArray to split the document into categories
	 * 		ex:) if (A) item = new appetizer(productcode, name, price)
	 * 			 If (B) item = new beverage(productcode, name, price)
	 */
	
	
	
	
	
//com.techelevator.transaction
	//Cart
	
	
	//Checkout
	/*
	 * 1. Where we can MakeChange method and calculate the change from the total adding the remainder into the UserAccount
	 */
	
	
	//Transaction
	/*
	 * 1. Where we remove purchased items from total inventory
	 */
	
	
	//UserAccount
	/*
	 * 1. Calculate user balance (starts at 0)
	 * 2. Create a deposit method
	 * 3. Create a purchase method
	 */
	
	
	//MakeChange
	/*
	 * 1. We can either make subclasses for all Bill denominations or we can convert all into cents and pass it to a double
	 */
	
	
	
}
