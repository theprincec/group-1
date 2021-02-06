package com.techelevator.transaction;

public class UserAccount {
	
	private double accountBalance;
	

	public UserAccount(double accountBalance) {
		this.accountBalance = 0;
	}
	
	public String addMoneyToAccount(double money) {
		if (accountBalance + money <=5000) {
			accountBalance += money;
		} else {
			System.out.println("Your account balance cannot be more than $5000. Please add less money") ;
		}
		//System.out.printf(format, args)
		return "Your account balance is" + accountBalance;
	}
	
	
	public String makePayment(double money) {
		if (accountBalance - money >= 0) {
			accountBalance -= money;
			return "Thanks for your purchase. Your account balance is"  + accountBalance;
		} else {
			return "You do not have enought money to make this purchase. Please Add to your account";
		}
		
	}
	
	
	

}
