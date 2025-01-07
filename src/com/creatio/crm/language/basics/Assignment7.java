package com.creatio.crm.language.basics;

/**
 * Assignment 7: Conditional Statements) A bank evaluates loan applicants based
 * on the following criteria: 
 * 1.Credit Score:
 * If the credit score is above 750,the loan is automatically approved.
 * If the credit score is between 650 and 750, additional checks are performed. 
 * If the credit score is below 650, the  loan is denied
 * 2.Income:
 * For credit scores between 650 and 750, the customer’s income must be at least $50,000 for the loan to be considered.
 * 3.Employment Status:
 * If the customer’s income is at least 50,000, the system checks whether the customer is employed.
 * If the customer is unemployed, the loan is denied.
 * 4.Debt-to-Income Ratio: 
 * If the customer is employed, the system checks the debt-to-income (DTI) ratio.
 * If the DTI ratio is less than 40%, the loan is approved.
 * If the DTI ratio is 40% or greater, the loan is denied. 
 * Author: SumitSagar
 *  Version: 1.0
 */

public class Assignment7 {

    public static void main(String[] args) {

        String customerName = "John Doe";
        int creditScore = 720;
        double income = 55000.0;
        boolean isEmployed = true;
        double debtToIncomeRatio = 35.0;

        String eligibility = "Denied"; // Default to denied
        String reason = "";

        if (creditScore > 750) {
            eligibility = "Approved (High Credit Score)";
        } else if (creditScore >= 650 && income >= 50000 && isEmployed && debtToIncomeRatio < 40) {
            eligibility = "Approved";
        } else {
          if (creditScore < 650){
            reason = "Credit score too low.";
          }
          else if (income < 50000){
            reason = "Income too low.";
          }
          else if (!isEmployed){
            reason = "Not currently employed.";
          }
          else if (debtToIncomeRatio >= 40){
            reason = "Debt-to-income ratio too high.";
          }

        }

        System.out.println("Customer: " + customerName);
        System.out.println("Loan Eligibility: " + eligibility);
        if (!reason.isEmpty()) {
            System.out.println("Reason: " + reason);
        }
    }
}

