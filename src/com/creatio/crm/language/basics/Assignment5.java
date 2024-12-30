package com.creatio.crm.language.basics;

import java.util.*;

/**
 * Assignment-5 Arrays & Collections
 * 1. Create a list of the top 5 most populated countries in the world and print 2nd Country 
 * 2. Create a set of the top 10 most visited tourist attractions in the world and print out its size. 
 * 3. Create a map of the 5 largest cities in the United States and their populations. 
 * 4. Create an array of 10 random integers and print out the sum of 3rd and 5th Value. 
 * 5. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
 * Author: SumitSagar
 * Version: 1.0
 */

public class Assignment5 {
	public static void main(String[] args) {
		
		// Task 1: List of the top 5 most populated countries
		        List<String> countries = Arrays.asList("India", "China", "United States", "Indonesia", "Pakistan");
        System.out.println("2nd most populated country: " + countries.get(1));

        // Task 2: Set of the top 10 most visited tourist attractions
        Set<String> attractions = new HashSet<>(Arrays.asList(
            "Eiffel Tower", "Taj Mahal", "Times Square", "Grand Bazar", "The Vatican Museums", 
            "Statue of Unity", "Niagara Falls", "Louvre Museum", "Great Wall of China", "Disney World"));
        System.out.println("Number of tourist attractions: " + attractions.size());

        // Task 3: Map of the 5 largest cities in the US and their populations
        Map<String, String> largestCities = new HashMap<>();
        largestCities.put("New York", "8,335,897");
        largestCities.put("Los Angeles", "3,898,747");
        largestCities.put("Chicago", "2,665,039");
        largestCities.put("Houston", "2,302,878");
        largestCities.put("Phoenix", "1,644,409");
        System.out.println("Largest cities in the US and their populations:");
        for (Map.Entry<String, String> entry : largestCities.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Task 4: Array of 10 random integers
        // Create an array to store random numbers
        
        int[] randomNumbers = new int[10];
        Random random = new Random();

       
        randomNumbers[0] = 40;
        randomNumbers[1] = 10;
        randomNumbers[2] = 78;
        randomNumbers[3] = 67;
        randomNumbers[4] = 43;
        randomNumbers[5] = 23;
        randomNumbers[6] = 22;
        randomNumbers[7] = 21;
        randomNumbers[8] = 56;
        randomNumbers[9] = 78;


        System.out.println("Sum of 3rd and 5th values: " + (randomNumbers[2] + randomNumbers[4]));

        // Task 5: List of the top 5 highest-grossing movies
        List<String> movies = Arrays.asList(
            "Avatar", "Avengers: Endgame", "Titanic", "Star Wars: The Force Awakens", "Avengers: Infinity War");
        System.out.println("3rd highest-grossing movie: " + movies.get(2));
    }

}
