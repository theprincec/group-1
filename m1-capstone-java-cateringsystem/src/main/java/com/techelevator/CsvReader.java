package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



public class CsvReader  {


	
	File file = new File("/m1-java-capstone-catering-system/cateringsystem.csv"); 
	
	public Set <String> items = new LinkedHashSet<String>(); 
	
	public void getItemsFromFile() {
			//String possItems = "";
			
			try (Scanner fileScanner = new Scanner(file)) {
		
			//adding to LinkedHashSet
			int lineNumber = 0;
			while (fileScanner.hasNextLine()) {
				String lineFromFile = fileScanner.nextLine();
				items.add(lineFromFile);
				lineNumber++;
				
				String itemsToPrint = "";
				
				
				for ( String item: items ) {
					//item.toString();
					System.out.println(item);
				}
			
			}
			
			
			
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	return  ;	
}	
}

