package com.ConditionalStatement;

import java.util.Scanner;

public class PositiveorNegativeNumber {

	public static void main(String[] args) {
		Scanner S1= new Scanner(System.in);
		System.out.println("Enter the Value3");
		int x=S1.nextInt();
		if(x>=0) {
			System.out.println("value of x is positive number: "+x);
			
		}else {
			System.out.println("value of x is negative number: " +x);
		}
		
	}

}
