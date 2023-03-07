package ex3;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 31/01/2023
 */

public class Ex3 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Constant variables
        final String EVENT_PRIVATE = "Private";
        final String EVENT_CORPORATE = "Corporate";
        final String PRIVATE_MANAGER = "C. Larman";
        final String CORPORATE_MANAGER = "Ken Bass";
        // Variable declaration and initialisation
        String eventManager = "";
        String eventType = "";
        int inputCode;

        // User input
        System.out.print("Enter event code: ");
        inputCode = input.nextInt();

        // Conditional statement
        if (inputCode == 1) {
            eventManager = PRIVATE_MANAGER;
            eventType = EVENT_PRIVATE;
        } else if (inputCode == 2) {
            eventManager = CORPORATE_MANAGER;
            eventType = EVENT_CORPORATE;
        } else {
            System.out.println("Invalid code! Please enter 1 or 2 only.");
        }// if-else

        // Output
        System.out.println("Event Type: " + eventType);
        System.out.println("Event Manager: " + eventManager);
    }// Main
}// Class - Ex3
