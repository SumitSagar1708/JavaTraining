package com.creatio.crm.language.basics;

import java.util.HashMap;

class StudentGrades {
    private HashMap<String, Integer> grades = new HashMap<>();

    public void addGrade(String name, int grade) {
        grades.put(name, grade);
        System.out.println("Grade for " + name + " is now " + grade);
    }

    public void removeGrade(String name) {
        if (grades.containsKey(name)) {
            grades.remove(name);
            System.out.println(name + "'s grade has been removed.");
        } else {
            System.out.println(name + " is not found.");
        }
    }

    public void showGrades() {
        if (grades.isEmpty()) {
            System.out.println("No grades available.");
        } else {
            System.out.println("Student Grades:");
            for (String name : grades.keySet()) {
                System.out.println(name + ": " + grades.get(name));
            }
        }
    }
}

public class Assinment9_StudentApp {
    public static void main(String[] args) {
        StudentGrades studentGrades = new StudentGrades();

        // Add grades
        studentGrades.addGrade("Alice", 85);
        studentGrades.addGrade("Bob", 90);

        // Remove a grade
        studentGrades.removeGrade("Alice");

        // Show grades
        studentGrades.showGrades();
    }
}

