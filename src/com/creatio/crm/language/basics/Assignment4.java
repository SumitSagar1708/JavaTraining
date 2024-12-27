package com.creatio.crm.language.basics;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Assignment-4 (Arrays , Classes and Objects) Create an Employees class that
 * Inside this Excel There are 3 TestCases with each Testcase having 3 rows of data. Now, 
   Create List<String, Map<String,String>> to store all the data and Print the data from Product details > 
   Supplier Name > Office Depot from the Map<String, Map<String,String>>
 * Author: SumitSagar
 *  Version: 1.0
 */

public class Assignment4 {

	public static void main(String[] args) {
		
		
		
		// Student Detail where use Map, HashMap
	
		Map<String, Map<String, String>> studentDetails = new HashMap<>();
		
        Map<String, String> student1Map = new HashMap<>();
        student1Map.put("Name", "John Doe");
        student1Map.put("Age", "20");
        student1Map.put("Gender", "Male");
        student1Map.put("Roll Number", "S12345");
        student1Map.put("Grade", "A");
        student1Map.put("Major", "Computer Science");
        student1Map.put("GPA", "3.8");
        student1Map.put("Email", "john@example.com");
        student1Map.put("Contact Number", "9999997777");
        student1Map.put("Address", "123 Elm St");
        
        Map<String, String> student2Map = new HashMap<String, String>();
        student2Map.put("Name", "Jane Smith");
        student2Map.put("Age", "21");
        student2Map.put("Gender", "Female");
        student2Map.put("Roll Number", "S12346");
        student2Map.put("Grade", "B");
        student2Map.put("Major", "Mathematics");
        student2Map.put("GPA", "3.5");
        student2Map.put("Email", "jane@example.com");
        student2Map.put("Contact Number", "9876665666");
        student2Map.put("Address", "456 Oak St");

        Map<String, String> student3Map = new HashMap<String, String>();
        student3Map.put("Name", "Mike Brown");
        student3Map.put("Age", "22");
        student3Map.put("Gender", "Male");
        student3Map.put("Roll Number", "S12347");
        student3Map.put("Grade", "A");
        student3Map.put("Major", "Physics");
        student3Map.put("GPA", "3.9");
        student3Map.put("Email", "mike@example.com");
        student3Map.put("Contact Number", "8787876546");
        student3Map.put("Address", "789 Pine St");

		studentDetails.put("student1Map", student1Map);
        studentDetails.put("student2Map", student2Map);
        studentDetails.put("student3Map", student3Map);
        
     
        
     // Employee Detail where use Map, HashMap
        Map<String, Map<String, String>> employeeDetails = new HashMap<>();
        Map<String, String> employee1 = new HashMap<>();
        employee1.put("Employee ID", "E001");
        employee1.put("Name", "Alice Green");
        employee1.put("Age", "30");
        employee1.put("Gender", "Female");
        employee1.put("Department", "Engineering");
        employee1.put("Position", "Software Engineer");
        employee1.put("Salary", "75000");
        employee1.put("Email", "alice@example.com");
        employee1.put("Contact Number", "9876543213");

        Map<String, String> employee2 = new HashMap<>();
        employee2.put("Employee ID", "E002");
        employee2.put("Name", "Bob Johnson");
        employee2.put("Age", "35");
        employee2.put("Gender", "Male");
        employee2.put("Department", "Marketing");
        employee2.put("Position", "Marketing Manager");
        employee2.put("Salary", "85000");
        employee2.put("Email", "bob@example.com");
        employee2.put("Contact Number", "9876543214");

        Map<String, String> employee3 = new HashMap<>();
        employee3.put("Employee ID", "E003");
        employee3.put("Name", "Carol White");
        employee3.put("Age", "28");
        employee3.put("Gender", "Female");
        employee3.put("Department", "Sales");
        employee3.put("Position", "Sales Executive");
        employee3.put("Salary", "65000");
        employee3.put("Email", "carol@example.com");
        employee3.put("Contact Number", "9876543215");

        employeeDetails.put("Employee1", employee1);
        employeeDetails.put("Employee2", employee2);
        employeeDetails.put("Employee3", employee3);
        
        
     // Product Detail where use Map, HashMap 
        Map<String, Map<String, String>> productDetails = new HashMap<>();
        Map<String, String> product1 = new HashMap<>();
        product1.put("Name", "Laptop");
        product1.put("Category", "Electronics");
        product1.put("Price", "$1200");
        product1.put("Stock Quantity", "50");
        product1.put("Supplier", "Tech Supplies");
        product1.put("Warranty", "2 years");
        product1.put("Rating", "4.5");
        product1.put("Manufacturing Date", "15-01-2023");
        product1.put("Manufacturing Date", "15-01-2025");
        

        Map<String, String> product2 = new HashMap<>();
        product2.put("Name", "Desk Chair");
        product2.put("Category", "Furniture");
        product2.put("Price", "$150");
        product2.put("Stock Quantity", "200");
        product2.put("Supplier", "Office Depot");
        product2.put("Warranty", "1 year");
        product2.put("Rating", "4");
        product2.put("Manufacturing Date", "10-02-2023");
        product2.put("Manufacturing Date", "NA");
        
        Map<String, String> product3 = new HashMap<>();
        product3.put("Name", "Coffee Maker");
        product3.put("Category", "Kitchen");
        product3.put("Price", "$75");
        product3.put("Stock Quantity", "100");
        product3.put("Supplier", "KitchenWorld");
        product3.put("Warranty", "6 months");
        product3.put("Rating", "4.2");
        product3.put("Manufacturing Date", "20-03-2023");
        product3.put("Manufacturing Date", "20-03-2024");

        productDetails.put("Product1", product1);
        productDetails.put("Product2", product2);
        productDetails.put("Product3", product3);
        
      //Create list using List<Map<String, Map<String, String>>>
		List<Map<String, Map<String, String>>>studentList = new ArrayList<>();
		List<Map<String, Map<String, String>>> empList = new ArrayList<>();
		List<Map<String, Map<String, String>>> productList = new ArrayList<>();  
        studentList.add(studentDetails);
        empList.add(employeeDetails);
        productList.add(productDetails);

        
        // Print Student Details
		/*
		 * Map<String, String> studentDetail1 = studentDetails.get("student1Map");
		 * System.out.println("Student: " + studentDetail1.get("Name"));
		 * System.out.println("Roll Number: " + studentDetail1.get("Roll Number"));
		 * System.out.println("Major: " + studentDetail1.get("Major"));
		 * System.out.println();
		 */

		/*
		 * Map<String, String> studentDetail2 = studentDetails.get("student2Map");
		 * System.out.println("Student: " + studentDetail2.get("Name"));
		 * System.out.println("Roll Number: " + studentDetail2.get("Roll Number"));
		 * System.out.println("Major: " + studentDetail2.get("Major"));
		 * System.out.println();
		 */
        
		/*
		 * Map<String, String> studentDetail3 = studentDetails.get("student3Map");
		 * System.out.println("Student: " + studentDetail3.get("Name"));
		 * System.out.println("Roll Number: " + studentDetail3.get("Roll Number"));
		 * System.out.println("Major: " + studentDetail3.get("Major"));
		 * System.out.println();
		 */

        // Print Employee Details
		/*
		 * Map<String, String> employeeDetail1 = employeeDetails.get("Employee1");
		 * System.out.println("Employee: " + employeeDetail1.get("Name"));
		 * System.out.println("Position: " + employeeDetail1.get("Position"));
		 * System.out.println("Department: " + employeeDetail1.get("Department"));
		 * System.out.println();
		 */

        // Print Product Details
		/*
		 * Map<String, String> productDetail1 = productDetails.get("Product1");
		 * System.out.println("Product Name: " + productDetail1.get("Name"));
		 * System.out.println("Supplier: " + productDetail1.get("Supplier"));
		 * System.out.println();
		 */
        Map<String, String> productDetail2 = productDetails.get("Product2");
        System.out.println("Product Name: " + productDetail2.get("Name"));
        System.out.println("Category: " + productDetail2.get("Category"));
        System.out.println("Price: " + productDetail2.get("Price"));
        System.out.println("Stock Quantity: " + productDetail2.get("Stock Quantity"));
        System.out.println("Supplier: " + productDetail2.get("Supplier"));
        System.out.println("Warranty: " + productDetail2.get("Warranty"));
        System.out.println("Rating: " + productDetail2.get("Rating"));
        System.out.println("Manufacturing Date: " + productDetail2.get("Manufacturing Date"));
        System.out.println("Expiry Date: " + productDetail2.get("Expiry Date"));
        System.out.println();
        
		/*
		 * Map<String, String> productDetail3 = productDetails.get("Product3");
		 * System.out.println("Product Name: " + productDetail3.get("Name"));
		 * System.out.println("Supplier: " + productDetail3.get("Supplier"));
		 * System.out.println();
		 */
    }

}
