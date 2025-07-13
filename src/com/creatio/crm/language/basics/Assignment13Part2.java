package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.List;

public class Assignment13Part2 {

	public static void main(String[] args) {
		String Word = "Java is a popular programming language." + " Java is used for web development,"
				+ " mobile applications, and more. " + "java is different than Javascript.";
		
		String targetWord = "Java";

		List<Integer> indexes = new ArrayList<>();
		
		int count = 0;

		for (int i = 0; i <= Word.length() - targetWord.length(); i++) {
			
			if (Word.substring(i, i + targetWord.length()).equals(targetWord)) {
				
				indexes.add(i);
				count++;
				i += targetWord.length() - 1;
			}
		}

		System.out.println("Total occurrences of \"" + targetWord + "\": " + count);
		if (count > 0) {
			System.out.print("Indexes: ");
			for (int index : indexes) {
				System.out.print(index + " ");
			}
			System.out.println();
		}

	}

}
