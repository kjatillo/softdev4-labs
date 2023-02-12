package ex3;

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
        int salesIndex = -1;
        for (int i = 0; i < salesList.length; i++) {
            if (salesList[i] > maxSales) {
                maxSales = salesList[i];
                salesIndex = i;
            }// for loop
        }// for loop

        System.out.printf("The largest sales is €%.2f made by %s", maxSales, salesmanNameList[salesIndex]);

        System.out.println("\n\n[Sales Report]");
        System.out.printf("%-15s%-15s\n", "Salesman", "Sales");
        for (int i = 0; i < salesmanNameList.length; i++) {
            System.out.printf("%-15s€%-15.2f\n", salesmanNameList[i], salesList[i]);
        }// for loop
    }// Main
}// Class - Ex3
