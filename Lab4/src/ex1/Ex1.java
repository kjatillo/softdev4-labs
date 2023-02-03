package ex1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 03/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Ex1 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Decimal format
        DecimalFormat df = new DecimalFormat("#,##0.00");
        // Constant variables
        final double BASE_HOURLY_WAGE = 7.25;
        final double OVERTIME_HOURLY_WAGE = BASE_HOURLY_WAGE * 1.5;
        final double COMMISSION_THRESHOLD = 50.0;
        final double COMMISSION_RATE = .05;
        // Declare variables
        int hoursWorked;
        double totalSales;
        double commission;
        double employeeWage = 0;

        // User input
        System.out.print("Enter hours worked: ");
        hoursWorked = input.nextInt();

        System.out.print("Enter total sales: ");
        totalSales = input.nextDouble();

        // Calculating hours worked
        if (hoursWorked <= 40 && hoursWorked > 0) {
            employeeWage += (hoursWorked * BASE_HOURLY_WAGE);
        } else if (hoursWorked > 40) {
            int overtimeHours = hoursWorked - 40;
            int baseHours = hoursWorked - overtimeHours;

            double overtimePay = overtimeHours * OVERTIME_HOURLY_WAGE;
            double basePay = baseHours * BASE_HOURLY_WAGE;
            employeeWage += (overtimePay + basePay);
        } else {
            System.out.println("Invalid input! Value for hours worked must be greater than 0.");
        }// if-else

        // Calculating commission
        if (totalSales > COMMISSION_THRESHOLD) {
            commission = totalSales * COMMISSION_RATE;
            employeeWage += commission;
        }// if-statement

        // Output
        System.out.println();
        System.out.println("Number of hours worked: " + hoursWorked);
        System.out.println("Total Sales: €" + df.format(totalSales));
        System.out.println("Total Wages: €" + df.format(employeeWage));
    }// Main
}// Class - Ex1
