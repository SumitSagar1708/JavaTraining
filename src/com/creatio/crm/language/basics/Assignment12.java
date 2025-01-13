package com.creatio.crm.language.basics;

/**
 * Assignment 12: Arrays and Loops
 * Print the numbers in diamond-shaped pyramid of numbers.
 * Author:SumitSagar
 * Version: 1.0.0
 */

public class Assignment12 {

	public static void main(String[] args) {
		int rows = 5;

		for (int i = 1; i <= rows; i++) {

			for (int space = 1; space <= rows - i; space++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int i = rows - 1; i >= 1; i--) {

			for (int space = 1; space <= rows - i; space++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
