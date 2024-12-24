package com.creatio.crm.language.basics;

public class EmpGroups extends Employees {
	public static void main(String[] args) {
		
		Employees obj =new Employees();
		
		String[][] empGroups = new String[3][3];

		empGroups[0][0] = obj.empNames[0];
		empGroups[0][1] = obj.empNames[1];
		empGroups[0][2] = obj.empNames[2];
		empGroups[0][0] = obj.empIDs[0];
		empGroups[1][0] = obj.empIDs[1];
		empGroups[2][0] = obj.empIDs[2];
		System.out.println("Employee Name: " + obj.empGroups[0][0] + obj.empGroups[0][0]);

	}

	

	
	
}

