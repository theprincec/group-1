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
	 * 		1.displays possibleItems
	 * 		2.  allows user to make selection
	 * 			- asks user for selection
	 * 			- asks user for quantity
	 * 			- asks for a deposit
	 *		3. adds userSelections to cart(may have to make new class) or transaction
	 *
	 *		Under Order Menu
	 *		1. Make a selection - prompts user for product code (getter for product code)
	 *		2. select quantity - pulls quantity from itemQuantity)
	 *		3.add items to cart - adds items to TemporaryCart
	 *
	 *
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
	 * 		
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

	
	
	//Checkout
	/*
	 * 1. Where we can MakeChange method and calculate the change from the total adding the remainder into the UserAccount
	 * 2.withdraw itemtotal from user balance 
	 */
	
	
	//Transaction
	/*
	 * 1. Where we remove purchased items from total inventory
	 * 2. add user selected items
	 * 3. calculate total
	 * 
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
