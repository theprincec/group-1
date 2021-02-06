package com.techelevator.readandwrite;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;




public class CsvReader   {
	//public static void main(String[] args) {
		List<String> listOfLines = new ArrayList<>();
		
		
		
		/*
		 * BufferedReader that prints lines to console as well
		 */
		/*
		
		BufferedReader bufReader = new BufferedReader(new FileReader("cateringsystem.csv"));
		
		
		String line = bufReader.readLine();
		while (line != null) {
			listOfLines.add(line);
			line = bufReader.readLine();

		}
		
		bufReader.close();
		
		System.out.println(listOfLines);
		*/
		
		/*
		 * Try loop that prints file to console
		 */
		
		
		public List<String> getItemsFromFile() {
		
			try {
			
			File myObj = new File ("cateringsystem.csv");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				//System.out.println(data);
				listOfLines.add(data);
				//System.out.println(data);
			}
			
			
			
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
			
		}
	
//			for (String line : listOfLines) {
//				System.out.println(line);
//			}
			return listOfLines;
			
		}
		public List<String> getItemsFromFilePrint() {
			
			try {
			
			File myObj = new File ("cateringsystem.csv");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
				//listOfLines.add(data);
				//System.out.println(data);
			}
			
			
			
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
			
		}
	
//			for (String line : listOfLines) {
//				System.out.println(line);
//			}
			return listOfLines;
			
		}

		
	}
//}
	
	/*
	 * End of try loop that prints to console
	 */
