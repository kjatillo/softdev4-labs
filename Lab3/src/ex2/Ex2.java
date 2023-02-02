package ex2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 02/02/2023
 */

public class Ex2 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Decimal format
        DecimalFormat df = new DecimalFormat("#,##0.00");
        // Constant variables
        final double GROSS_THRESHOLD = 50000.0;
        final double TAX_SINGLE = .2;
        final double TAX_MARRIED = .23;
        final double ALLOWANCE_MORE_THAN_50 = 20000.0;
        final double ALLOWANCE_LESS_THAN_50 = 25000.0;
        final String PASSWORD = "password";
        // Variable declaration and initialisation
        int employeeID;
        String name;
        String address;
        char maritalStatus;
        double taxablePay = 0;
        double grossPay;
        double tax = 0;
        double netPay = 0;
        String inputPassword;

        // User input
        System.out.print("Enter employee ID: ");
        employeeID = input.nextInt();
        input.nextLine();

        System.out.print("Enter employee name: ");
        name = input.nextLine();

        System.out.print("Enter employee address: ");
        address = input.nextLine();

        System.out.print("Enter marital status ('s' single/'m' married): ");
        maritalStatus = input.next().charAt(0);

        System.out.print("Enter employee gross pay: ");
        grossPay = input.nextDouble();
        input.nextLine();

        // Calculation
        if (grossPay < GROSS_THRESHOLD) {
            taxablePay = grossPay - ALLOWANCE_LESS_THAN_50;
        } else if (grossPay >= GROSS_THRESHOLD) {
            taxablePay = grossPay - ALLOWANCE_MORE_THAN_50;
        }// if-else

        if (maritalStatus == 's') {
            tax = taxablePay * TAX_SINGLE;
            netPay = grossPay - tax;
        } else if (maritalStatus == 'm') {
            tax = taxablePay * TAX_MARRIED;
            netPay = grossPay - tax;
        }// if-else

        // Output
        System.out.printf("\n[ Payroll Details for Employee %d ]\n\n", employeeID);
        System.out.printf("%-20s%-20s\n", "Employee ID:", employeeID);
        System.out.printf("%-20s%-20s\n", "Employee Name:", name);
        System.out.printf("%-20s%-20s\n", "Employee Address:", address);
        System.out.printf("%-20s%-20s\n", "Marital Status:", (maritalStatus == 's' ? "Single": "Married"));  // Ternary
        System.out.printf("%-20s€%-20s\n", "Gross Pay:", df.format(grossPay));

        System.out.printf("\nFor gross €%s, your total tax is €%s and net pay is €%s\n", df.format(grossPay),
                df.format(tax), df.format(netPay));

        System.out.println("\n[ Security Feature ]");
        System.out.print("Enter Password: ");
        inputPassword = input.nextLine();

        if (inputPassword.equals(PASSWORD)) {
            System.out.println("Password matched!");
        } else {
            System.out.println("Password DID NOT match!");
        }// if-else
    }// Main
}// Class - Ex2
