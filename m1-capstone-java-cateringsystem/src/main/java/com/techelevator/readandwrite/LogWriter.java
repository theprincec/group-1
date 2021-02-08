package com.techelevator.readandwrite;

import com.techelevator.*;
import com.techelevator.item.Item;
import com.techelevator.transaction.UserAccount;
import com.techelevator.transaction.FinalCart;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map.Entry;



public class LogWriter {

	UserAccount userAccount = new UserAccount();
	FinalCart finalCart = new FinalCart();
	
	  public static void main(String[] args) {
		    try {
		      File myObj = new File("Log.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
	  
	  private String getDateAndTime() {

			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
			LocalDateTime now = LocalDateTime.now();

			return dtf.format(now);
		}
	  
	  
//	  	01/01/2019 12:00:00 PM ADD MONEY: $500.00 $500.00 XXXXXXXXXXXXXXXXXX
//      01/01/2019 12:00:15 PM ADD MONEY: $250.00 $750.00
//      01/01/2019 12:00:20 PM 15 Chicken E4 $112.50 $637.50
//      01/01/2019 12:01:25 PM 9 Red Wine B2 $29.25 $608.25
//      01/01/2019 12:01:35 PM GIVE CHANGE: $608.25 $0.00
//	  
	
	  public void WriteDeposit() {

		    try {
		      FileWriter myWriter = new FileWriter("Log.txt");
		      
		      myWriter.write(getDateAndTime() +  "ADD MONEY: " + userAccount.getUserDeposit() + userAccount.getAccountBalance()); //CHECK IF getUSerDeposit IS CORRECTLY USED
		      myWriter.close();
		      
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
	  
	  public void WriteOrderItems() {

		    try {
		    	
			      FileWriter myWriter = new FileWriter("Log.txt");
			      
			      for (Entry<Item, Integer> entry : finalCart.getCartMap().entrySet()) {
			    	
			    	  myWriter.write(getDateAndTime() + entry.getKey() + (entry.getKey().getPrice()*entry.getValue()) + userAccount.getAccountBalance()); //CHECK IF getUSerDeposit IS CORRECTLY USED
				      myWriter.close();
			    	  
			      }
		      
		      
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
	  
	  public void WriteChange() {

		    try {
		      FileWriter myWriter = new FileWriter("Log.txt");
		      
		      myWriter.write(getDateAndTime() +  "GIVE CHANGE: " + userAccount.getUserDeposit() + userAccount.getAccountBalance()); //CHECK IF getUSerDeposit IS CORRECTLY USED
		      myWriter.close();
		      
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
	
	
}

