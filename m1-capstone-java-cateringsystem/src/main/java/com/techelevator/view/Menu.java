
package com.techelevator.view;

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


/*
 * This is the only class that should have any usage of System.out or System.in
 */
public class Menu {
	


	private  Scanner in = new Scanner(System.in);

	
	ObjectConverter objectConverter = new ObjectConverter();
	CsvReader csvReader = new CsvReader();
	
	UserAccount userAccount = new UserAccount(0);
	FinalCart finalCart = new FinalCart();
	Item item = new Item("","",0.0,50);
	
	
	public String mainMenuDispay() {
		
		System.out.println( " Main Menu ");
		System.out.println(" ================================================= ");		
		System.out.println(" 1) Display Catering Items " );
		System.out.println(" 2) Order " );
		System.out.println(" 3) Quit " );
		return in.nextLine();
	}

		
	public String placeOrderScreen() {
	
		System.out.println(" Order ");
		System.out.println(" ================================================== ");
		System.out.println(" 1) Add Funds ");
		System.out.println(" 2) Make a selection ");
		System.out.println(" 3) Checkout ");
		System.out.println(" Your Account Balance is $" + userAccount.getAccountBalance()) ;
	
		String userChoice = in.nextLine();
		
		if (userChoice.equals("1")) {
			 askForUserDeposit();
		}
		else if (userChoice.equals("2")) {
			 placeOrderSelection();	
		}
		else if (userChoice.equals("3")) {
			//return "";//checkout.checkoutmethod;
		} return mainMenuDispay();
	}
	
	
	public String placeOrderSelection() {
		System.out.println(" Order ");
		System.out.println(" ================================================== ");
		System.out.println(" 1) Make a selection ");
		
		String userInput = in.nextLine();
		Map<String, Item> newMapofItems = new LinkedHashMap<String, Item>();
		newMapofItems = objectConverter.mapMaker();

		if (newMapofItems.containsKey(userInput)) {
			return placeOrderQuantity();
			
		}  
			System.out.println("This Is not a valid selection. Please select another item");
			return placeOrderSelection();
				
	}
		
		
		

	
		
	

		
	public String placeOrderQuantity(){
		System.out.println(" ================================================== ");
		System.out.println(" 2) select quantity ");
		
		String userInput = in.nextLine();
		Map <String,Item>newMapofItems = objectConverter.mapMaker();
		int userInputQuantityAsInt = 0;
		userInputQuantityAsInt = Integer.parseInt(userInput);
		
		
	
		
		if(userInputQuantityAsInt <= item.getItemQuantity()) {
			finalCart.addItem(newMapofItems.get(userInput) , userInputQuantityAsInt); //Throws Number Format Exception
			System.out.print("Your item was added to your cart. Make another selection");
			System.out.println();
		} 
		if (userInputQuantityAsInt > item.getItemQuantity()) {
			System.out.println("Sorry only" + item.getItemQuantity() + "left! Please select again");
		
		} return placeOrderSelection();
	}
	
	public String askForUserDeposit () {
		

		System.out.println("Make a deposit");
		System.out.println("==============================");
		System.out.println("Enter amount of $ to add");
		
		String userDeposit = in.nextLine();
		Double deposit = Double.valueOf(userDeposit);
			
		
			if (deposit + userAccount.getAccountBalance() > 5000) {
				System.out.println("Account balance cannot exceed $5000");
			} if(deposit + userAccount.getAccountBalance() < 5000) {
				userAccount.addMoneyToAccount(deposit);
				System.out.println("Thanks for your deposit!");
			} return placeOrderScreen();
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
		}
		if(choice == null) {
			System.out.println("\n*** "+userInput+" is not a valid option ***\n");
		}
		return choice;
	}
	
	}	
