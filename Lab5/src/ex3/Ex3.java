package ex3;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 09/02/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Ex3 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        final double BASE_COST = 100.0;
        final double UNDER_18_CHARGE = 10.0;
        final double OVER_18_CHARGE = 20.0;
        int numPassengersInCar;
        int numCarsWithOnlyDriver = 0;
        int totalPassengers = 0;
        String registrationNum;
        boolean inputContinue;
        boolean ageCheck;
        double carCost;
        double totalRevenue = 0;


        System.out.println("===================");
        System.out.println("Hollyhead Express");
        System.out.println("===================");
        do {
            int numPassengers = 0;
            int numPassengersUnder18 = 0;
            int numPassengersOver18 = 0;

            // User input
            System.out.print("Enter the registration number of the car: ");
            registrationNum = input.next();

            System.out.print("Enter the number of passengers in the car: ");
            numPassengersInCar = input.nextInt();
            totalPassengers += numPassengersInCar;

            if (numPassengersInCar > 1) {
                while (numPassengers < (numPassengersInCar - 1)) {
                    System.out.printf("Is passenger %d under 18 years of age? (true or false): ", numPassengers + 1);
                    ageCheck = input.nextBoolean();

                    if (ageCheck) {
                        numPassengersUnder18++;
                    } else {
                        numPassengersOver18++;
                    }// inner if-statement

                    numPassengers++;
                }// while loop
                carCost = BASE_COST + (numPassengersUnder18 * UNDER_18_CHARGE) + (numPassengersOver18 * OVER_18_CHARGE);
                totalRevenue += carCost;
                System.out.printf("Cost for car with registration %s: €%.2f\n", registrationNum, carCost);
            } else if (numPassengersInCar == 1) {
                carCost = BASE_COST;
                totalRevenue += carCost;
                numCarsWithOnlyDriver++;
                System.out.printf("Cost for car with registration %s: €%.2f\n", registrationNum, carCost);
            }// outer if-statement
            System.out.print("\nAre there more cars to board? (true or false): ");
            inputContinue = input.nextBoolean();
        } while (inputContinue);
        // Output
        System.out.printf("\nTotal revenue: €%.2f\n", totalRevenue);
        System.out.printf("Total people carried: %d\n", totalPassengers);
        System.out.printf("Number of cars with driver only: %d\n", numCarsWithOnlyDriver);
    }// Main
}// Main
