package com.creatio.crm.language.basics;


public class Employees{
	
	String[] empNames = new String[3];
	String[] empIDs = new String[3];
	
	empNames[0] = "Bharath";
	empNames[1] = "ABC";
	empNames[2] = "XYZ";
	empIDs[0] = "1234";
	empIDs[1] = "1235";
	empIDs[2] = "1236";
	
}

public class EmpGroups{
	Employees obj =new Employees();
	
	String[][] empGroups = new String[3][3];

	empGroups[0][0] = obj.empNames[0];
	empGroups[0][1] = obj.empNames[1];
	empGroups[0][2] = obj.empNames[2];
	empGroups[0][0] = obj.empIDs[0];
	empGroups[1][0] = obj.empIDs[1];
	empGroups[2][0] = obj.empIDs[2];
}

public class Assignment3 {

	public static void main(String[] args) {
		Employees emp =new Employees();
		EmpGroups empgp = new EmpGroups();
		System.out.println("Employee Name: " + empgp.empGroups[0][0]);
	}

}
}
}
