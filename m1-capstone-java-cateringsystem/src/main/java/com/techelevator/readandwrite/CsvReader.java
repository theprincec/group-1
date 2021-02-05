package com.techelevator.readandwrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class CsvReader  {
	public static void main(String[] args, Object String) throws IOException {
		
		/*
		 * BufferedReader that prints lines to console as well
		 */
		
		
		BufferedReader bufReader = new BufferedReader(new FileReader("cateringsystem.csv"));
		List<String> listOfLines = new ArrayList<>();		
		
		String line = bufReader.readLine();
		while (line != null) {
			listOfLines.add(line);
			line = bufReader.readLine();
		}
		
		bufReader.close();
		
		System.out.println(listOfLines);
		
		/*
		 * Try loop that prints file to console
		 */
		
		
		
	try {
		File myObj = new File ("cateringsystem.csv");
		Scanner myReader = new Scanner(myObj);
		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			System.out.println(data);
		}
		myReader.close();
	} catch (FileNotFoundException e) {
		System.out.println("An error occured");
		e.printStackTrace();
		
		
		
		
	}
	
	}
	
	
	/*
	 * End of try loop that prints to console
	 */
	
	/*
	 * Previous Code Start
	 */
	
	
	/*
	
	File file = new File("/m1-java-capstone-catering-system/cateringsystem.csv"); 
	
	//public Set <String> items = new LinkedHashSet<String>(); 
	
	public List<String> getItemsFromFile() throws FileNotFoundException {
			//String possItems = "";
			
		List<String> items = new ArrayList<String>();
		
			try (Scanner fileScanner = new Scanner(file)) {
		
			//adding to LinkedHashSet
			//int lineNumber = 0;
			
			while (fileScanner.hasNextLine()) {
				
				//String lineFromFile = fileScanner.nextLine();
				String line = fileScanner.nextLine();
				items.add(line);
				//items.add(lineFromFile);
				//lineNumber++;
			}
			return items;
			
		
			
		//return items.toString();	
}
	
} 


*/
	
	/*
	 * Previous code ends
	 */
			
	}



