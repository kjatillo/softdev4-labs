package ex1;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 18/02/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        int numHouses;
        int numSales;

        // User input
        System.out.print("Enter the number of houses: ");
        numHouses = input.nextInt();

        // DoorToDoor class instance
        DoorToDoor myEstate = new DoorToDoor(numHouses);

        // Populating the house numbers array
        myEstate.fillHouses();

        // Populating the house sales array
        for (int i = 0; i < numHouses; i++) {
            System.out.printf("Enter sales of house #%d: ", i + 1);
                numSales = input.nextInt();
                myEstate.fillSales(i + 1, numSales);
        }// for loop

        // Average sales
        System.out.printf("\nAverage Sales of all houses: %.2f\n", myEstate.calcAverageSales());

        // Minimum sales
        System.out.println();
        myEstate.minSales();

        // Display houses and corresponding sales
        System.out.println("\n[Sales For All Houses]");
        myEstate.displayALl();

        // Display sorted sales in descending order
        System.out.println();
        myEstate.sortSalesArray();
    }// Main
}// Class - Main
