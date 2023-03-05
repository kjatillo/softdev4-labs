package ex7;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 31/01/2023
 */

public class Ex7 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        final String PINE = "Pine";
        final String OAK = "Oak";
        final String MAHOGANY = "Mahogany";
        // Variable declaration and initialisation
        double pricePine = 100.00;
        double priceOak = 225.00;
        double priceMahogany = 310.00;
        int priceDefault = 0;
        int userInput;

        // User input
        System.out.print("Enter Option: ");
        userInput = input.nextInt();

        // Conditional statement/Output
        if (userInput == 1) {
            System.out.println("Wood Type: " + PINE);
            System.out.println("Price: €" + pricePine);
        } else if (userInput == 2) {
            System.out.println("Wood Type: " + OAK);
            System.out.println("Price: €" + priceOak);
        } else if (userInput == 3) {
            System.out.println("Wood Type: " + MAHOGANY);
            System.out.println("Price: €" + priceMahogany);
        } else {
            System.out.println("Wood Type: Unknown");
            System.out.println("Price: €" + priceDefault);
        }// if-else
    }// Main
}// Class - Ex7
