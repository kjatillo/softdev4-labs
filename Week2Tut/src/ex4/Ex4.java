package ex4;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 31/01/2023
 */

public class Ex4 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Constant variable
        final String SURNAME = "Atillo";
        String inputSurname;

        // User input
        System.out.print("Enter Surname: ");
        inputSurname = input.nextLine();

        // Conditional statement
        if (inputSurname.equals(SURNAME)) {
            System.out.println("Surname is a match!");
        } else {
            System.out.println("Surname DID NOT match!");
        }// if-else
    }// Main
}// Class - Ex4
