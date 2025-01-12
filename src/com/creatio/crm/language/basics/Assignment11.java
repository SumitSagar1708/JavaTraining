package com.creatio.crm.language.basics;

/**
 * Assignment 11:(Arrays and Loops)
 * Store the values in Array and Print second and third largest number from the above values without
   using collections and default sort methods
 * Author: SumitSagar
 *  Version: 1.0
 */
public class Assignment11 {

	public static void main(String[] args) {
		int A[] = { 12, 34, 11, 36, 87, 98, 93 };
		int Max1, Max2, Max3;
		Max1 = Max2 = Max3 = A[0];

		for (int i = 0; i < A.length; i++) {
			if (A[i] > Max1) {
				Max3 = Max2;
				Max2 = Max1;
				Max1 = A[i];
			}
			else if (A[i] > Max2) 
			{
				Max2 = A[i];
			}
			else if (A[i] > Max3)
			{
				Max3 = A[i];

			}

		}
		System.out.println("Print the Maximum Number " + Max1);
		System.out.println("Print the Second Maximum Number " + Max2);
		System.out.println("Print the Third Maximum Number "+ Max3);

	}

}
