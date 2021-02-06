package com.techelevator.transaction;

public class UserAccount {
	
	public int balance = 0;

	public int deposit() {
		return balance;///BALANCE +=DEPOSIT
		
	}
	
	public int purchase() {
		return balance;///BALANCE -=PURCHASE
	}
	
	
	public int getBalance() {
		return balance;
	}
	
}
