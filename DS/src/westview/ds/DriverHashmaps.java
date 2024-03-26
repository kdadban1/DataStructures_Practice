package westview.ds;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DriverHashmaps {

	public static void main(String[] args) {

//		HashMap m = new HashMap<String, String>();
//
//		// adding entries to our map ("dictionary")
//		m.put("nice", "mean");
//		m.put("motivated", "lazy");
//		m.put("rich", "poor");
//
//		// query the map for a non-existing key
//		System.out.println(m.get("study"));
//
//		// query the map for something that exists
//		System.out.println(m.get("motivated"));
//
//		System.out.println(m.size());
//
//		HashMap m2 = new HashMap<String, ArrayList<String>>();
//
//		// list of favorite food
//		ArrayList<String> food = new ArrayList<String>();
//		food.add("Pasta");
//		food.add("Pizza");
//		food.add("Chicken");
//		food.add("Protein");
//
//		m2.put("Kian", food);
//
//		System.out.println(m2.get("Kian"));
		
		
		//# of cases for a particular state
		
		HashMap m = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> cases = new ArrayList<Integer>();

		// get the scanner going to read the csv file
		// which should be outside the src folder

		try {
			
			
			//User input
			while(true) {
			
			Scanner userInput = new Scanner(System.in); // Create a Scanner object 
			System.out.println("Please enter a State");
			String state = userInput.nextLine(); // Read user input
			
			Scanner scanner = new Scanner(new File("covid417.csv"));
			String[] row = null;
			String confirmed = null;
			while (scanner.hasNextLine()) {
					row = scanner.nextLine().split(",");
			}
			
			for (int i = 0; i < row.length; i++) {
				if (row[i].equals(state)) {
					confirmed = scanner.next();
				}
			}

			scanner.close();
			
			System.out.println(state +" state confirmed total is: " + confirmed + ". \n Please enter a city: \n"); // Output user input
			String city = userInput.nextLine(); // Read user input
			System.out.println("The confirmed number of cases in "+ city +", "+state+" is: ");
			}
			
		} catch (Exception e) {

			System.out.println(e);

		}

	}

}
