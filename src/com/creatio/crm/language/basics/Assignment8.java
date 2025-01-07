package com.creatio.crm.language.basics;

import java.util.HashMap;
import java.util.Map;

public class Assignment8 {

	public static void main(String[] args) {
		// Employee data: Name -> {Base Salary, Experience, Rating}
		Map<String, double[]> employees = new HashMap<>();
		employees.put("Alice Johnson", new double[] { 75000, 5, 4.2 });
		employees.put("Bob Smith", new double[] { 68000, 3, 3.8 });
		employees.put("Carol Davis", new double[] { 82000, 7, 4.5 });
		employees.put("David Brown", new double[] { 90000, 10, 2.0 });
		employees.put("Eva Green", new double[] { 60000, 2, 3.5 });

		// Hike Percentages Map
		Map<String, Double> hikePercentages = new HashMap<>();

		for (Map.Entry<String, double[]> entry : employees.entrySet()) {
			String name = entry.getKey();
			double[] details = entry.getValue();
			double baseSalary = details[0];
			int experience = (int) details[1]; // Explicit cast to int
			double rating = details[2];

			// Determine variable pay percentage and bonus using if-else for clarity
			double variablePay;
			double bonus;
			if (rating >= 4) {
				variablePay = 15;
				bonus = 1500;
			} else if (rating >= 3) {
				variablePay = 10;
				bonus = 1200;
			} else {
				variablePay = 3;
				bonus = 300;
			}

			double reward = experience >= 5 ? 5000 : 0;

			// Calculate Hike
			double hike = (baseSalary * variablePay / 100) + bonus + reward;
			double hikePercentage = (hike / baseSalary) * 100;

			// Store in map
			hikePercentages.put(name, hikePercentage);
		}

		// Print results using a simpler loop
		for (Map.Entry<String, Double> entry : hikePercentages.entrySet()) {
			System.out.println(entry.getKey()+ entry.getValue());
		}
	}
}