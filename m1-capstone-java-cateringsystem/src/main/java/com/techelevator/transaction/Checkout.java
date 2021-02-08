package com.techelevator.transaction;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.techelevator.item.*;
import com.techelevator.readandwrite.*;
import com.techelevator.item.Item;
//import com.techelevator.finalcart.*;
import com.techelevator.transaction.*;


public  class Checkout {
	
	FinalCart finalCart = new FinalCart();
	
	UserAccount userAccount = new UserAccount();
	//UserAccount - final Cart Balance
	//print cart items to the log
	
	public double takePayment() {
		
		double accountBalanceAfterPayment = 0;
		accountBalanceAfterPayment = userAccount.getAccountBalance() - finalCart.getCartTotal();
		userAccount.setAccountBalance(accountBalanceAfterPayment);
		return userAccount.getAccountBalance();
		
		//userAcc - finalcart.getCartTotal();	
	}
	
	
	
//Set AccountBalance
	
}