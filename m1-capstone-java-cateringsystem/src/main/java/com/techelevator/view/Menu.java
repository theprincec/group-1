
package com.techelevator.view;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import com.techelevator.item.Appetizer;
import com.techelevator.item.Beverage;
import com.techelevator.item.Dessert;
import com.techelevator.item.Entree;
import com.techelevator.item.Item;
import com.techelevator.readandwrite.*;
import com.techelevator.transaction.FinalCart;
import com.techelevator.transaction.UserAccount;
import com.techelevator.*;


/*
 * This is the only class that should have any usage of System.out or System.in
 */
public class Menu {
	
	private  final Scanner in = new Scanner(System.in);

	//private ObjectConverter objectConverter;
	private
	
	ObjectConverter objectConverter = new ObjectConverter();
	//CsvReader csvReader = new CsvReader();
	//String userInput = "";
	UserAccount userAccount = new UserAccount(0);
	FinalCart finalCart = new FinalCart();
	Item item = new Item(null, null, null);
	
	
	public String mainMenuDispay() {
		
		System.out.println( " Main Menu ");
		System.out.println(" ================================================= ");		
		System.out.println(" 1) Display Catering Items " );
		System.out.println(" 2) Order " );
		System.out.println(" 3) Quit " );
		return in.nextLine();
		
	}
	/*
	public String mainMenuDispay1() {

		System.out.println( "Do you want to order? ");
		System.out.println(" ================================================= ");		
		
		System.out.println(" 2) Order " );
		System.out.println(" 3) Quit " );
		return in.nextLine();
		
	}
		
		*/
		
	public String placeOrder() {
	
		System.out.println(" Order ");
		System.out.println(" ================================================== ");
		System.out.println(" 1) Add Funds ");
		System.out.println(" 2) Make a selection ");
		System.out.println(" 3) Checkout ");
		System.out.println(" Your Account Balance is") ;   //************

		String userChoice = in.nextLine();

		 if (userChoice.equals("2")) {
		return placeOrderSelection();
			//sfs
		} 

		return "";
	}
		
	
	public String placeOrderSelection() {
		
		//ERROR SOLUTION
		String userInputSelection = ""; 
		userInputSelection = in.nextLine();
		Map<String, Item> newMapofItems = new LinkedHashMap<String, Item>();
		newMapofItems = objectConverter.mapMaker();
		
		
		System.out.println(" Order ");
		System.out.println(" ================================================== ");
		System.out.println(" 1) Make a selection ");
	
		if (newMapofItems.containsKey(userInputSelection)) {
			String checkedUserInputSelection = userInputSelection;
			
			System.out.println("This works. its a miracle.");
			return placeOrderQuantity();
			
		} else {
			return "This Is not a valid selection. Please select another item";
	}
		}
	

		
	public String placeOrderQuantity() {
		//String userInputQuantity = "";
		
		
		//ERROR SOLUTION
		String userInputSelection = ""; 
		userInputSelection = in.nextLine();
	
		//Map<String, Item> newMapofItems = new LinkedHashMap<String, Item>();
		Map <String,Item>newMapofItems = objectConverter.mapMaker();

		//Item userItem = newMapofItems.;
		
		System.out.println(" Select Quantity ");
		System.out.println(" ================================================== ");
		System.out.println(" 2) select quantity ");
		
		String userInputQuantity = in.nextLine();
		int userInputQuantityAsInt = 0;
		userInputQuantityAsInt = Integer.parseInt(userInputQuantity);
		//Item useritem = new Item(null, null, null);
		
		//***************************************************************
		
		finalCart.addItem(newMapofItems.get(userInputSelection), userInputQuantityAsInt );  //Need to Instantiate
		//addItemToCart(newMapofItems.getValue(userInputSelection)); //in Cart class
		
		
		System.out.print("Your item was added to your cart. Make another selection");
		//System.out.println("This works. Its a miracle.");
		
			
		return placeOrderSelection();
//			/*
//			 * 1. Select productcode
//			 * 2.select quantity
//			 * 3. Add to cart
//			 * 4. subtract from itemquantity(TemporaryCart)
//			 */
//			
//			//return placeOrderQuantity();
//			//System.out.println("Make a new selection");
//			//return in.nextLine();
//		} System.out.println( "Doesnt work, obvi");
	}
	
	
	
	
	
	
	
	
	
	
	
		
		
		//return in.nextLine();
	//}
		
	private String checkItemType(Item item) {
		if (item instanceof Appetizer) {
			return "Appetizer";
		} 
		
		if (item instanceof Beverage) {
			return "Beverage";
		}
		
		if (item instanceof Entree) {
			return "Entree";
		}
		
		if (item instanceof Dessert) {
			return "Dessert";
		}
		
		
		return "";
	}
	
	
	
	
	private Object getChoiceFromUserInput(Object[] options) {
		Object choice = null;
		String userInput = in.nextLine();
		try {
			int selectedOption = Integer.valueOf(userInput);
			if(selectedOption > 0 && selectedOption <= options.length) {
				choice = options[selectedOption - 1];
			}
		} catch(NumberFormatException e) {
			// eat the exception, an error message will be displayed below since choice will be null
		}
		if(choice == null) {
			System.out.println("\n*** "+userInput+" is not a valid option ***\n");
		}
		return choice;
	}
	
	}	
