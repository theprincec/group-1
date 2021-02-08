package com.techelevator.readandwrite;

import com.techelevator.*;
import com.techelevator.transaction.UserAccount;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class LogWriter {

	UserAccount userAccount = new UserAccount();
	
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
	  
	  public void WriteDateAndTime() {

		    try {
		      FileWriter myWriter = new FileWriter("Log.txt");
		      
		      myWriter.write(getDateAndTime() ); //CHECK IF getUSerDeposit IS CORRECTLY USED
		      myWriter.close();
		      
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }

	  
	  public void WriteItemAndQuantity() {

		    try {
		      FileWriter myWriter = new FileWriter("Log.txt");
		      
		      myWriter.write(/*Item and Quantity*/); //CHECK IF getUSerDeposit IS CORRECTLY USED
		      myWriter.close();
		      
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
	
	  public void WriteDeposit() {

		    try {
		      FileWriter myWriter = new FileWriter("Log.txt");
		      
		      myWriter.write(userAccount.getUserDeposit()); //CHECK IF getUSerDeposit IS CORRECTLY USED
		      myWriter.close();
		      
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
	
	  public void WriteAccountBalance() {

		    try {
		      FileWriter myWriter = new FileWriter("Log.txt");
		      
		      myWriter.write(userAccount.getAccountBalance()); //CHECK IF getUSerDeposit IS CORRECTLY USED
		      myWriter.close();
		      
		      System.out.println("Successfully wrote to the file.");
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
}

