package com.creatio.crm.language.basics;

/**
 * Assignment 1: Data Types
 * Different ways of printing
 * Author: SumitSagar
 * Version: 1.0
 */
public class Assignment1 {

    public static void main(String[] args) {
        
        // Temperature of a city in degrees Celsius.
        double cityTemperature = 25.5;
        System.out.println("Temperature of the city in Celsius: " + cityTemperature);

        // Whether a customer has placed an order.
        boolean hasPlacedOrder = true;
        System.out.printf("Customer has placed an order: %b%n", hasPlacedOrder);

        // Person's phone number.
        String phoneNumber = "123-456-7890";
        System.out.println("Person's phone number: " + phoneNumber);

        // Amount of money in a customer's bank account.
        double bankBalance = 1000.50;
        System.out.printf("Bank account balance: $%.2f%n", bankBalance);

        // Person's email address.
        String emailAddress = "sumit.sagar.108@gmail.com";
        System.out.println("Email address: " + emailAddress);


        // Coordinates of a location (latitude, longitude).
        double latitude = 37.7749;
        double longitude = -122.4194;
        System.out.println("Location coordinates (latitude, longitude): " + latitude + ", " + longitude);

        // Person's marital status.
        boolean isMarried = false;
        System.out.println("Marital status: " + isMarried);

        // Person's occupation.
        String occupation = "Software Engineer";
        System.out.println("Occupation: " + occupation);

        // Person's favorite color.
        String favoriteColor = "Blue";
        System.out.println("Favorite color: " + favoriteColor);


        // Current year.
        int currentYear = 2023;
        System.out.println("Current year: " + currentYear);

        // Number of followers on a social media platform.
        int followers = 1000000; 
        System.out.printf("Number of followers: %,d%n", followers);

        // Rating of a movie.
        float movieRating = 7.5f;
        System.out.println("Movie rating: " + movieRating);

        // Person's blood type.
        char bloodType = 'A';
        System.out.println("Blood type: " + bloodType);


        // Title of a book.
        String bookTitle = "To Kill a Mockingbird";
        System.out.println("Book title: " + bookTitle);

        // Number of employees in a company.
        int numberOfEmployees = 500;
        System.out.println("Number of employees: " + numberOfEmployees);

        // Time of an event.
        String eventTime = "2:30 PM";
        System.out.println("Event time: " + eventTime);

        // Name of a country.
        String countryName = "United States";
        System.out.println("Country name: " + countryName);

        // Person's eye color.
        String eyeColor = "Brown";
        System.out.println("Eye color: " + eyeColor);

        // Person's birthplace.
        String birthPlace = "New York City";
        System.out.println("Birthplace: " + birthPlace);

        // Distance between two cities.
        double distanceBetweenCities = 200.5;
        System.out.printf("Distance between two cities: %.1f km%n", distanceBetweenCities);

    }
}
