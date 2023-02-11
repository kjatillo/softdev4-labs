package ex1;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 10/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Ex1 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        final int NUM_OF_MACHINES = 4;
        final double LESS_100_COST = .50;
        final double BETWEEN_100_400_COST = .40;
        final double GREATER_400_COST = .30;
        int[] machineCodeList = new int[4];
        int machineCode;
        int daysOperational;
        int productionUnit;
        double dailyCost;
        double totalOverallWeeklyCost = 0;
        int totalOverallProductionUnit = 0;
        int countProductionUnitGreater1000 = 0;

        // User input
        for (int i = 0; i < NUM_OF_MACHINES; i++) {
            int totalWeeklyProductionUnit = 0;
            double totalWeeklyCost = 0;

            System.out.printf("Machine %d's Code: ", i + 1);
            machineCode = input.nextInt();
            machineCodeList[i] = machineCode;

            System.out.printf("Machine %d number of days operational: ", machineCode);
            daysOperational = input.nextInt();
            System.out.println();
            for (int j = 0; j < daysOperational; j++) {
                System.out.printf("Machine %d production for day %d: ", machineCodeList[i], j + 1);
                productionUnit = input.nextInt();
                totalWeeklyProductionUnit += productionUnit;
                totalOverallProductionUnit += totalWeeklyProductionUnit;

                // Calculating unit cost
                if (productionUnit < 100) {
                    dailyCost = productionUnit * LESS_100_COST;
                } else if (productionUnit <= 400) {
                    dailyCost = productionUnit * BETWEEN_100_400_COST;
                } else {
                    dailyCost = productionUnit * GREATER_400_COST;
                }// if

                System.out.printf("Machine %d produced %d units for day %d at a cost of €%.2f\n\n",
                        machineCodeList[i], productionUnit, j + 1, dailyCost);

                totalWeeklyCost += dailyCost;
            }// inner for loop
            totalOverallWeeklyCost += totalWeeklyCost;
            // Checking of weekly production unit value is greater than 1000
            if (totalWeeklyProductionUnit > 1000)
                countProductionUnitGreater1000++;

            System.out.printf("Machine %d weekly production cost at %d units: €%.2f\n\n",
                    machineCodeList[i], totalWeeklyProductionUnit, totalWeeklyCost);
        }// outer for loop
        System.out.printf("Total weekly cost: €%.2f\n", totalOverallWeeklyCost);
        System.out.printf("Total weekly production: %d\n", totalOverallProductionUnit);
        System.out.printf("Machine that produced over 1000 units: %d\n", countProductionUnitGreater1000);
    }// Main
}// Class - Ex1
