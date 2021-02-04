package com.techelevator;

import com.techelevator.view.Menu;

/*
 * This class should control the workflow of the application, but not do any other work
 * 
 * The menu class should communicate with the user, but do no other work
 * 
 * The work of the Catering System should be in other classes that you build and 
 * call from here. 
 */
public class CateringSystemCLI {
	
	/*
	 * The menu class is instantiated in the main() method at the bottom of this file.  
	 * It is the only class instantiated in the starter code.  
	 * You will need to instantiate all other classes using the new keyword before you can use them.
	 * 
	 * Remember every class and data structure is a data types and can be passed as arguments to methods or constructors.
	 */
	private Menu menu;
	private CsvReader csvreader;

	public CateringSystemCLI(Menu menu) {
		this.menu = menu;
	}
	
	public CateringSystemCLI(CsvReader csvreader) {
		this.csvreader = csvreader;
	}

	/*
	 * Your application starts here
	
	 */
	
	String listOfPossibleItems = "";
	
	public void run() {
		while (true) {
			
		
			
			
			String choice = menu.mainMenuDispay();
			if (choice.equals("1")) {
				
				csvreader.getItemsFromFile(); 
			}
			if (choice.equals("3")) {
				break;
			}
		}
		//return "Not a valid selection" ;
	}	
		
			/*
			Display the Starting Menu and get the users choice
			
			IF the User Choice is Display Vending Machine Items, 
				THEN display vending machine items
			ELSE IF the User's Choice is Purchase,
				THEN go to the purchase menu
			*/
				
			
	

	/*
	 * This starts the application, but you shouldn't need to change it.  
	 */
	public static void main(String[] args) {
	
		CsvReader csvReader = new CsvReader();
		
		Menu menu = new Menu();
		System.out.println("");
		CateringSystemCLI cli = new CateringSystemCLI(menu);
		cli.run();
	}
	
	
	
}
