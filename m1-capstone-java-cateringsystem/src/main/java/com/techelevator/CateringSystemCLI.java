package com.techelevator;

import java.util.List;



import com.techelevator.readandwrite.CsvReader;
import com.techelevator.readandwrite.ObjectConverter;
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
	private ObjectConverter objectConverter;
	private int choice = 0;
	

	/*
	 * Constructor for listOfLines
	 */
	

	public CateringSystemCLI(Menu menu, CsvReader csvreader) {
		this.csvreader = csvreader;
		this.menu = menu;
	}
	
	

	/*
	 * Your application starts here
	
	 */
	
	
	public void run() {
		while (true) {
			
			/*
			Display the Starting Menu and get the users choice
			
			IF the User Choice is Display Vending Machine Items, 
				THEN display vending machine items
			ELSE IF the User's Choice is Purchase,
				THEN go to the purchase menu
			*/
				
			
			

			String choice = menu.mainMenuDispay();

			if (choice.equals("1")) {
				csvreader.getItemsFromFilePrint(); 

				//choice = menu.placeOrder();
				System.out.println();
				choice = menu.mainMenuDispay();
				}

			if (choice.equals("2") ) {

				System.out.println("into the order menu");

				
				
//				if (choice.equals("1")); {
//					
//					System.out.println("into the deposit");
//					choice = menu.askForUserDeposit();
//					
//					}
				if (choice.equals("2")); {
					
					System.out.println("into the order selection");
					menu.placeOrderSelection();
					
				}
			}	
		
			if (choice.equals("3")); {
				System.out.println();
				System.out.println("Thanks for Shopping");
				break;
				
			}
		}
	}
		
	
		
		
		
		
		
	
		
		
	

	/*
	 * This starts the application, but you shouldn't need to change it.  
	 */
	public static void main(String[] args) {
	
		CsvReader csvReader = new CsvReader();
		ObjectConverter objectConverter = new ObjectConverter();
		Menu menu = new Menu();
		System.out.println("");
		CateringSystemCLI cli = new CateringSystemCLI(menu, csvReader);
		cli.run();
	} 
	
}
	

