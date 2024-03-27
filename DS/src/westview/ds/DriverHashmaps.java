package westview.ds;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
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
				int stateCases = 0; // keep track of number of cases total
				Scanner scanner = new Scanner(new File("covid417.csv"));
				Scanner userInput = new Scanner(System.in); // Create a Scanner object
				System.out.println("Please enter a State");
				String state = userInput.nextLine().trim().toLowerCase(); // read user input and turn lowercase

				// turn the state lowercase and compare to each state in the file
				while (scanner.hasNextLine()) {
					String[] row = scanner.nextLine().toLowerCase().split(",");
					if (row[1].equals(state)) {
						int confirmed = Integer.parseInt(row[2].trim()); //get the number of confirmed cases (2nd row)
						stateCases += confirmed;
					}
				}
				m.put(state, stateCases); //link the number of cases to the state

				System.out.println(state + " state confirmed total is: " + m.get(state) + ". \n Please enter a city: \n");

				// Now read the city input
				String city = userInput.nextLine().trim().toLowerCase();
				scanner.close();

				// Open the file again for reading the city data
				Scanner scanner2 = new Scanner(new File("covid417.csv"));
				int cityCases = 0; // Reset cityCases for each iteration

				// turn the city lowercase and compare to each row
				while (scanner2.hasNextLine()) {
					String[] row = scanner2.nextLine().toLowerCase().split(",");
					if (row[0].equals(city)) {
						int confirmed = Integer.parseInt(row[2].trim()); //get the number of confirmed cases (2nd row)
						cityCases += confirmed;
					}
				}
				m.put(city, cityCases); //link the number of cases to the city

				System.out.println("The confirmed number of cases in " + city + ", " + state + " is: " + m.get(city));
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
