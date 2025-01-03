package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.List;

/**
 * Assignment 6: Loops and Conditional
 * Print total number of credit and debit transactions completed
 * Print the total amount credited and debited in account
 *  Print total amount remaining at the end in Bank Account
 *  If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
   Transaction with Amount” and also print total number of suspicious transactions
 * Author: SumitSagar
 * Version: 1.0
 */

public class Assignment6 {
    public static void main(String[] args) {
        // List of transactions
        int A[] = {50000, -2000, 3000, -15000, -200, -300, 4000, -3000};

        int creditTransaction = 0,
            debitTransaction = 0,
            totalCreditTransaction = 0,
            totalDebitTransaction = 0,
            suspiciousCount = 0;

        for (int i = 0; i < A.length; i++) { 
            int transaction = A[i]; 
            if (transaction > 0) {
                creditTransaction++;
                totalCreditTransaction += transaction;
                if (transaction > 10000) {
                    System.out.println("Suspicious credit transaction: " + transaction);
                    suspiciousCount++;
                }
            } else {
                debitTransaction++;
                totalDebitTransaction += transaction;
                if (transaction < -10000) {
                    System.out.println("Suspicious debit transaction: " + transaction);
                    suspiciousCount++;
                }
            }
        }

        System.out.printf("Total credit transactions: %d%n", creditTransaction);
        System.out.printf("Total debit transactions: %d%n", debitTransaction);
        System.out.printf("Total credited: %d%n", totalCreditTransaction);
        System.out.printf("Total debited: %d%n", Math.abs(totalDebitTransaction));
        System.out.printf("Remaining balance: %d%n", totalCreditTransaction + totalDebitTransaction);
        System.out.printf("Suspicious transactions: %d%n", suspiciousCount);
    }
}
