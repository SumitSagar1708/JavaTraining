package com.creatio.crm.language.basics;

/**
 * Assignment 2: Product Data Storage with 3D Array
 * 
 * This program demonstrates storing and displaying hierarchical product data
 * using a 3D array.
 * Author:SumitSagar
 * Version: 1.0.0
 */

public class Assignment2 {
	public static void main(String[] args) {
		// 3D array to store product data
		String[][][] products = {
				// Category1: Groceries
				{
						// Subcategory: Beverages
						{ "Cola", "Orange Juice", "Lemonade", "Green Tea", "Black Coffee" },
						// Subcategory: Snacks
						{ "Popcorn", "Trail Mix", "Beef Jerky", "Salted Nuts", "Rice Cakes" },
						// Subcategory: Dairy Products
						{ "Cottage Cheese", "Heavy Cream", "Ice Cream", "Parmesan Cheese", "Eggnog" },
						// Subcategory: Produce
						{ "Apples", "Bananas", "Carrots", "Potatoes", "Onions" } },
				// Category2: Electronics
				{
						// Subcategory: Mobile Phones
						{ "Smartphone", "Feature Phone", "Gaming Phone", "Basic Phone", "Foldable Phone" },
						// Subcategory: Laptops
						{ "Gaming Laptop", "Business Laptop", "Ultrabook", "2-in-1 Laptop", "Netbook" },
						// Subcategory: Cameras
						{ "DSLR", "Mirrorless Camera", "Action Camera", "Camcorder", "360 Camera" },
						// Subcategory: Audio
						{ "Headphones", "Bluetooth Speaker", "Home Theater", "Soundbar", "Earbuds" } } };

		// Displaying data
		System.out.println("Category1: Groceries");
		System.out.println("  Subcategory: Beverages");
		System.out.println("    " + products[0][0][0]);
		System.out.println("    " + products[0][0][1]);
		System.out.println("    " + products[0][0][2]);
		System.out.println("    " + products[0][0][3]);
		System.out.println("    " + products[0][0][4]);
		System.out.println("  Subcategory: Snacks");
		System.out.println("    " + products[0][1][0]);
		System.out.println("    " + products[0][1][1]);
		System.out.println("    " + products[0][1][2]);
		System.out.println("    " + products[0][1][3]);
		System.out.println("    " + products[0][1][4]);
		System.out.println("  Subcategory: Dairy Products");
		System.out.println("    " + products[0][2][0]);
		System.out.println("    " + products[0][2][1]);
		System.out.println("    " + products[0][2][2]);
		System.out.println("    " + products[0][2][3]);
		System.out.println("    " + products[0][2][4]);
		System.out.println("  Subcategory: Produce");
		System.out.println("    " + products[0][3][0]);
		System.out.println("    " + products[0][3][1]);
		System.out.println("    " + products[0][3][2]);
		System.out.println("    " + products[0][3][3]);
		System.out.println("    " + products[0][3][4]);

		System.out.println("Category2: Electronics");
		System.out.println("  Subcategory: Mobile Phones");
		System.out.println("    " + products[1][0][0]);
		System.out.println("    " + products[1][0][1]);
		System.out.println("    " + products[1][0][2]);
		System.out.println("    " + products[1][0][3]);
		System.out.println("    " + products[1][0][4]);
		System.out.println("  Subcategory: Laptops");
		System.out.println("    " + products[1][1][0]);
		System.out.println("    " + products[1][1][1]);
		System.out.println("    " + products[1][1][2]);
		System.out.println("    " + products[1][1][3]);
		System.out.println("    " + products[1][1][4]);
		System.out.println("  Subcategory: Cameras");
		System.out.println("    " + products[1][2][0]);
		System.out.println("    " + products[1][2][1]);
		System.out.println("    " + products[1][2][2]);
		System.out.println("    " + products[1][2][3]);
		System.out.println("    " + products[1][2][4]);
		System.out.println("  Subcategory: Audio");
		System.out.println("    " + products[1][3][0]);
		System.out.println("    " + products[1][3][1]);
		System.out.println("    " + products[1][3][2]);
		System.out.println("    " + products[1][3][3]);
		System.out.println("    " + products[1][3][4]);

	}
}
