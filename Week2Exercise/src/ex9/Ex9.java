package ex9;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 31/01/2023
 */

public class Ex9 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Variable declaration
        int month;
        int numDaysInMonth;

        // User input
        System.out.print("Enter a month number: ");
        month = input.nextInt();

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> numDaysInMonth = 31;
            case 2 -> numDaysInMonth = 28;
            case 4, 6, 9, 11 -> numDaysInMonth = 30;
            default -> numDaysInMonth = 0;
        }// switch

        // Conditional statement/Output
        if (month > 0 && month <= 12) {
            System.out.println("Days in the month: " + numDaysInMonth);
        } else {
            System.out.println("Invalid input!");
        }// if-else
    }// Main
}// Class - Ex9
