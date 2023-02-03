package ex6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 03/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Ex6 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Decimal format
        DecimalFormat df = new DecimalFormat("#,##0.00");
        // Variable declaration
        final int MONTHS_IN_YEAR = 12;
        double loanAmount;
        double annualRate;
        int loanPeriod;

        // User input
        System.out.print("Enter the load amount: ");
        loanAmount = input.nextDouble();

        System.out.print("Enter annual interest rate: ");
        annualRate = input.nextDouble();

        System.out.print("Enter the loan period in years: ");
        loanPeriod = input.nextInt();

        // Calculation
        int numPayments = loanPeriod * MONTHS_IN_YEAR;
        double monthlyRate = annualRate / 100.0 / MONTHS_IN_YEAR;
        double monthlyPayment = (loanAmount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -numPayments));
        double totalPayment = monthlyPayment * (loanPeriod * 12);

        // Output
        System.out.println();
        System.out.println("Loan Amount: €" + df.format(loanAmount));
        System.out.println("Interest Rate: " + annualRate);
        System.out.println("Loan Period (Years): " + loanPeriod);
        System.out.println("Monthly Payment: €" + df.format(monthlyPayment));
        System.out.println("Total Payment: €" + df.format(totalPayment));
    }// Main
}// Class - Ex6
