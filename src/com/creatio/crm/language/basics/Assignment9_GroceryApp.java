package com.creatio.crm.language.basics;

import java.util.ArrayList;

class GroceryList {
    private ArrayList<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
        System.out.println(item + " has been added.");
    }

    public void removeItem(String item) {
        if (items.remove(item)) {
            System.out.println(item + " has been removed.");
        } else {
            System.out.println(item + " is not in the list.");
        }
    }

    public void showList() {
        if (items.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("Your grocery list:");
            for (String item : items) {
                System.out.println("- " + item);
            }
        }
    }
}

public class Assignment9_GroceryApp {
    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();

        // Add items to the list
        groceryList.addItem("Milk");
        groceryList.addItem("Bread");

        // Remove an item
        groceryList.removeItem("Bread");

        // Show the list
        groceryList.showList();
    }
}


