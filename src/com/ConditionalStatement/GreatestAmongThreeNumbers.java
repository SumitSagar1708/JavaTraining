package com.ConditionalStatement;

import java.util.Scanner;

public class GreatestAmongThreeNumbers {

	public static void main(String[] args) {
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter Value of a");
		int a= S1.nextInt();
		System.out.println("Enter Value of b");
		int b= S1.nextInt();
		System.out.println("Enter Value of c");
		int c= S1.nextInt();

		if (a>b && a>c) {
			System.out.println("a is the greatest number");
		} else if (b > a && b > c) {

			System.out.println("b is the greatest number");
		} else {

			System.out.println("c is the greatest number");
		}
	}
}
