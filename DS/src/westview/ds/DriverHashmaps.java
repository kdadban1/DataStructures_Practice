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

		// # of cases for a particular state

		;

		// get the scanner going to read the csv file
		// which should be outside the src folder

		try {

			HashMap m = new HashMap<String, Integer>();
			

			// User input
			while (true) {

				int cases = 0;
				Scanner scanner = new Scanner(new File("covid417.csv"));
				Scanner userInput = new Scanner(System.in); // Create a Scanner object
				System.out.println("Please enter a State");
				String state = userInput.nextLine(); // Read user input
				String stateLow = state.trim().toLowerCase();
				
				//turn every row into lowercase
				while (scanner.hasNextLine()) {
					String[] row = scanner.nextLine().split(",");
					row[0].toLowerCase();
					row[1].toLowerCase();
					//check if a row has the state
					for (int i = 0; i < row.length; i++) {
						if (row[i].indexOf(stateLow) != -1) {
							int confirmed = Integer.parseInt(row[2]); // get number of confirmed cases
							cases += confirmed; // add the integers of confirmed cases to the list
						}
					}
				}
				m.put(stateLow, cases); // link the state to the number of cases

				System.out.println(state + " state confirmed total is: " + m.get(stateLow) + ". \n Please enter a city: \n"); 
				
				
				
				
				
				
				String city = userInput.nextLine(); // Read user input
				scanner.close();
				
				
				Scanner scanner2 = new Scanner(new File("covid417.csv"));
				cases = 0;
				while (scanner2.hasNextLine()) {
					String[] row = scanner2.nextLine().split(",");

					//check if a row has the city
					for (int i = 0; i < row.length; i++) {
						if (row[i].indexOf(city) != -1) {
							int confirmed = Integer.parseInt(row[2]); // get number of confirmed cases
							cases += confirmed; // add the integers of confirmed cases to the list
							m.put(city, cases); // link the city to the number of cases
						}
					}
				}
				
				System.out.println("The confirmed number of cases in " + city + ", " + state + " is: " + m.get(city));
				
			}

		} catch (Exception e) {

			System.out.println(e);

		}

	}

}
