package com.creatio.crm.language.basics;

/**
 * Assignment 2: Product Data Storage with 3D Array
 * Using a 3D Array.
 * Author:SumitSagar
 * Version: 1.0.0
 */

public class Assignment12 {

	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = n - 1; i >= 1; i--) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
