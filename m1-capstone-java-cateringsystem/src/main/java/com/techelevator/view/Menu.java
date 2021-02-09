
package com.techelevator.view;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

import com.techelevator.item.Appetizer;
import com.techelevator.item.Beverage;
import com.techelevator.item.Dessert;
import com.techelevator.item.Entree;
import com.techelevator.item.Item;
import com.techelevator.readandwrite.*;
import com.techelevator.transaction.FinalCart;
import com.techelevator.transaction.UserAccount;
import com.techelevator.transaction.Checkout;
import com.techelevator.transaction.Change;


// **** ln208


/*
 * This is the only class that should have any usage of System.out or System.in
 */
public class Menu {
	


	private  Scanner in = new Scanner(System.in);

	
	ObjectConverter objectConverter = new ObjectConverter();
	CsvReader csvReader = new CsvReader();
	
	UserAccount userAccount = new UserAccount();
	FinalCart finalCart = new FinalCart();
	Item item = new Item("","",0.0,50);
	Checkout checkout = new Checkout();
	LogWriter logWriter = new LogWriter();
	Change change = new Change();
	
	//String userMenuSelect = "";
	public String mainMenuDisplay() {
		
		System.out.println( " Main Menu ");
		System.out.println(" ================================================= ");		
		System.out.println(" 1) Display Catering Items " );
		System.out.println(" 2) Order " );
		System.out.println(" 3) Checkout" );
		System.out.println(" 4) Quit") ;

		String userChoice = in.nextLine();
		
		if (userChoice.equals("1")) {
			 csvReader.getItemsFromFilePrint(); 
		}
		
		 if (userChoice.equals("2")) {
			 placeOrderScreen();	
		}
		if (userChoice.equals("3")) {
			checkoutMenu();
		if (userChoice.equals("4")) {
			System.exit(0);
			System.out.println();
            System.out.println("Thanks for Shopping");
        }
		else {
			 System.exit(0);
		}
	} return mainMenuDisplay();
		

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
		 if (userChoice.equals("2")) {
			 placeOrderSelection();	
		}
		 if (userChoice.equals("3")) {
			checkoutMenu();
		 return mainMenuDisplay();
	}
		return "";
	}
	String userInputSelect= "";
			
	public String placeOrderSelection() {
		System.out.println(" Make a selection ");
		System.out.println(" ================================================== ");
		System.out.println(" Enter Product Code");
		System.out.println();
		System.out.println(" 2) Main Menu ");
		
		userInputSelect = in.nextLine();
		
		Map<String, Item> newMapofItems = new LinkedHashMap<String, Item>();
		newMapofItems = objectConverter.mapMaker();

		if (newMapofItems.containsKey(userInputSelect)) {
			return placeOrderQuantity();
			

		} else if (userInputSelect.equals("2")) {
			return mainMenuDisplay();
		}
			System.out.println("This Is not a valid selection. Please select another item");
			return placeOrderSelection();
				
	}
		

		
		

	
		
	

		
	public String placeOrderQuantity(){
		System.out.println(" ================================================== ");
		System.out.println("Enter quantity ");
		
		String userInput = in.nextLine();
		
		Map <String,Item>newMapofItems = objectConverter.mapMaker();
		int userInputQuantityAsInt = 0;
		userInputQuantityAsInt = Integer.parseInt(userInput);
		
		
	
		
		if(userInputQuantityAsInt <= item.getItemQuantity()) {
			finalCart.addItem(newMapofItems.get(userInputSelect) , userInputQuantityAsInt); //Throws Number Format Exception
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
				logWriter.WriteDeposit();
				System.out.println("Your account balance is $" + userAccount.getAccountBalance() + " after your deposit!");
			} return mainMenuDisplay();
	}


	
	public String checkoutMenu() {
		
		
		System.out.println("Checkout");
		System.out.println("==============================");
		
		System.out.println("Your current Account Balance is:" + userAccount.getAccountBalance());
		
		for (Entry<Item, Integer> entry : finalCart.getCartMap().entrySet()) {
			System.out.println(entry);	
		}
		
		System.out.println( "Cart Total: $" + finalCart.getCartTotal());
		
		
		System.out.println("==============================");
		System.out.println();
		System.out.println("Enter 1 to checkout");
		
		String userInput = in.nextLine();
		
		if (userInput.equals("1")) {
			checkout.takePayment();
			logWriter.WriteOrderItems();
			logWriter.WriteChange();
			change.printChange(userAccount.getAccountBalance());
			
			
		}
		else {
			return "Not a valid selection ";
		}
		 return "";
		
	
		
		
		
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
