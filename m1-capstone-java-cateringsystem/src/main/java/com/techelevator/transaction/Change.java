package com.techelevator.transaction;
 import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.techelevator.*;
import com.techelevator.item.Item;

public class Change {
	
	
	private Map<String, Integer> changeMap = new LinkedHashMap<String, Integer>();
	Integer[] changeValuesArray = new Integer[] {2000, 1000, 500, 100, 25, 10, 5, 1};
	String[] changeNames = new String[] {"Twenties", "Tens", "Fives", "Ones", "Quarters", "Dimes", "Pennies"};
	//private Map<String, Integer> mapToReturn  = new LinkedHashMap<String, Integer>();

	

	public Map<String, Integer> getChange(double change){
		int amountToPassThrough = (int) change*100;
		int numberOfBills = 0;
		//int passingAmount = 0;
		for (int i = 0; i < changeValuesArray.length; i++) {
			numberOfBills = amountToPassThrough % changeValuesArray[i];
			amountToPassThrough -= (numberOfBills * changeValuesArray[i]);
			changeMap.put(changeNames[i], numberOfBills);	
		} 
		return changeMap;
	}
	
	
	public String printChange( double change){
		getChange(change);
		//int passingAmount = 0;
		for (Entry<String, Integer> changeLine : changeMap.entrySet()) {
			System.out.println(changeLine.getKey() + ": " + changeLine.getValue());
		} 
		return "";
	}
	
	
	
	

	


//	public Map<String, Integer> makeChange(UserAccount userAccount, FinalCart finalCart) {
//		int changeInCents = (int) userAccount.getAccountBalance() * 100 ;
//		getNickels(getDimes(getQuarters(getOnes(getFives(getTens(getTwenties(changeInCents)))))));
//		return changeMap;
//	}

//	for (value: valueList) {
//		
//	}
	
	
	private int getTwenties(int change) {
		changeMap.put("Twenties", change / 2000);
		return change % 2000;
	}

	private int getChangePerValue(int change) {
		changeMap.put("Tens", change / 1000);
		int changeGiven = change % 1000;
		int changeToPassThrough = change - changeGiven;
		return changeToPassThrough;
	}

	private int getFives(int change) {
		changeMap.put("Fives", change / 500);
		return change % 500;

	}

	private int getOnes(int change) {
		changeMap.put("Ones", change / 100);
		return change % 100;

	}

	private int getQuarters(int change) {
		changeMap.put("Quarters", change / 25);
		return change % 25;

	}

	private int getDimes(int change) {
		changeMap.put("Dimes", change / 10);
		return change % 10;

	}

	private void getNickels(int change) {
		changeMap.put("Nickels", change / 5);
	}
}


