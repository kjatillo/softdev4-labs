package ex3;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 12/02/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Ex3 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Decimal format
        DecimalFormat df = new DecimalFormat("#,##0.00");
        // Variables
        String name;
        double sales;

        // User input
        System.out.print("Enter the number of salesman: ");
        int numSalesman = input.nextInt();
        input.nextLine();
        System.out.println();

        // Array
        String[] salesmanNameList = new String[numSalesman];
        double[] salesList = new double[numSalesman];

        for (int i = 0; i < numSalesman; i++) {
            System.out.printf("Enter name of salesman %d: ", i + 1);
            name = input.nextLine();
            salesmanNameList[i] = name;

            System.out.printf("Enter sales for %s: €", name);
            sales = input.nextDouble();
            salesList[i] = sales;
            input.nextLine();
            System.out.println();
        }// for loop

        // Calculating max sales and retrieving salesman name using index
        double maxSales = 0;
        double minSales = salesList[0];
        int maxSalesIndex = -1;
        int minSalesIndex = -1;
        for (int i = 0; i < salesList.length; i++) {
            if (salesList[i] > maxSales) {
                maxSales = salesList[i];
                maxSalesIndex = i;
            }// if-statement

            if (salesList[i] < minSales) {
                minSales = salesList[i];
                minSalesIndex = i;
            }// if-statement
        }// for loop

        // Output
        System.out.printf("The largest sales is €%s made by %s\n", df.format(maxSales), salesmanNameList[maxSalesIndex]);
        System.out.printf("The minimum sales is €%s made by %s\n", df.format(minSales), salesmanNameList[minSalesIndex]);
        System.out.printf("Total Overall Sales: €%s\n\n", df.format(Arrays.stream(salesList).sum()));

        System.out.println("[Sales Report]");
        System.out.printf("%-15s%-15s\n", "Salesman", "Sales");
        for (int i = 0; i < salesmanNameList.length; i++) {
            System.out.printf("%-15s€%-15s\n", salesmanNameList[i], df.format(salesList[i]));
        }// for loop
    }// Main
}// Class - Ex3
