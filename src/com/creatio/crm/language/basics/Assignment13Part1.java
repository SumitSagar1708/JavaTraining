package com.creatio.crm.language.basics;

public class Assignment13Part1 {

	public static void main(String[] args) {
		String sentence = "Java programming is fun and challenging";

        
        System.out.println("Word Count: " + sentence.split("\\s+").length);

       
        String[] words = sentence.split("\\s+");
        System.out.print("Reversed: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println();

        
        StringBuilder result = new StringBuilder();
        for (String word : sentence.split("\\s+")) {
            result.append(word.substring(0, 1).toUpperCase())
                  .append(word.substring(1)).append(" ");
        }
        System.out.println("Capitalized: " + result.toString().trim());
    }

}
