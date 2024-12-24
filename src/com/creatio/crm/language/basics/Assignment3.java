package com.creatio.crm.language.basics;

/**
 * Assignment -3 (Arrays , Classes and Objects) Create an Employees class that
 * stores the following employee names and IDs in separate variables: Then, create another class called 
   EmpGroups that contains two arrays to store the employee names and IDs.
 *  Retrieve the data from the Employees class, store it in these arrays, and finally print each employee's 
    name along with their corresponding ID. 
 * Author: SumitSagar
 *  Version: 1.0
 */

// Employees class to store employee details
class Employees {
	String empNames1 = "Bharath";
	String empNames2 = "ABC";
	String empNames3 = "XYZ";

	String empIDs1 = "1234";
	String empIDs2 = "1235";
	String empIDs3 = "1236";
}

// EmpGroups class to store and process employee arrays
class EmpGroups {
	
	String[] empNames = new String[3];
	String[] empIDs = new String[3];

	// Method to populate arrays using Employees object
	public void populateEmployeeData(Employees obj) {
		empNames[0] = obj.empNames1;
		empNames[1] = obj.empNames2;
		empNames[2] = obj.empNames3;
		empIDs[0] = obj.empIDs1;
		empIDs[1] = obj.empIDs2;
		empIDs[2] = obj.empIDs3;
	}
}

// Main class to run the program
public class Assignment3 {
	public static void main(String[] args) {
		Employees emp = new Employees();
		EmpGroups empgp = new EmpGroups();

		empgp.populateEmployeeData(emp);

		// Print employee details

		System.out.println("Employee Name: " + empgp.empNames[0] + ", Employee ID: " + empgp.empIDs[0]);
		System.out.println("Employee Name: " + empgp.empNames[1] + ", Employee ID: " + empgp.empIDs[1]);
		System.out.println("Employee Name: " + empgp.empNames[2] + ", Employee ID: " + empgp.empIDs[2]);
	}
}
