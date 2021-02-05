package com.techelevator.view;
import java.io.InputStream;
import java.util.Scanner;

import com.techelevator.item.Appetizer;
import com.techelevator.item.Beverage;
import com.techelevator.item.Dessert;
import com.techelevator.item.Entree;
import com.techelevator.item.Item;
import com.techelevator.readandwrite.*;



/*
 * This is the only class that should have any usage of System.out or System.in
 */
public class Menu {
	
	private  final Scanner in = new Scanner(System.in);
	private CsvReader csvreader;
	private ObjectConverter objectConverter;
	private
	
	String userInput = "";
	
	
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
		System.out.println(" 1) Make a selection ");
			
		//System.out.println(" 2) select quantity ");
		
		//System.out.println(" 3) add items to cart");
		return in.nextLine();
	}
		
	public String placeOrderSelection() {
		System.out.println(" Order ");
		System.out.println(" ================================================== ");
		System.out.println(" 1) Make a selection ");
		
		//If the list contains the user selection 
		InputStream x =System.in ;
		if (objectConverter.itemKeyName.containsKey(in.nextLine())) {
			System.out.println("Yes");
			/*
			 * 1. Select productcode
			 * 2.select quantity
			 * 3. Add to cart
			 * 4. subtract from itemquantity(TemporaryCart)
			 */
			
			//return placeOrderQuantity();
			//System.out.println("Make a new selection");
			//return in.nextLine();
		} return "";
		
	}

		
	public String placeOrderQuantity() {
		userInput = "";
		System.out.println(" Select Quantity ");
		System.out.println(" ================================================== ");
	
		System.out.println(" 2) select quantity ");
		
		return in.nextLine();
	}
		
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

