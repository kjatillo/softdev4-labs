package ex4;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 03/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Ex4 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Constant variable
        final double POUND_TO_EURO = 1.27;
        // Variable declaration
        int inputCoinageAmount;
        double convertedAmount = 0;

        // User input
        System.out.print("Enter the coinage amount: ");
        inputCoinageAmount = input.nextInt();

        // Conditional statement/Calculation
        // convertedAmount = (POUND_TO_EURO * (inputCoinageAmount / 100.0)) * 100;
        switch (inputCoinageAmount) {
            case 50 -> convertedAmount = POUND_TO_EURO * (50 / 100.0) * 100;
            case 20 -> convertedAmount = POUND_TO_EURO * (20 / 100.0) * 100;
            case 10 -> convertedAmount = POUND_TO_EURO * (10 / 100.0) * 100;
            case 5 -> convertedAmount = POUND_TO_EURO * (5 / 100.0) * 100;
            case 2 -> convertedAmount = POUND_TO_EURO * (2 / 100.0) * 100;
            case 1 -> convertedAmount = POUND_TO_EURO * (1 / 100.0) * 100;
        }// Switch

        // Output
        System.out.printf("%dp in euro is %.2f cents", inputCoinageAmount, convertedAmount);
    }// Main
}// Class - Ex4
