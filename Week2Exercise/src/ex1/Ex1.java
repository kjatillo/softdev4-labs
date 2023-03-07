package ex1;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 31/01/2023
 */

public class Ex1 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Constant variable declaration and initialisation
        final String MERIT = "Merit";
        final String PASS = "Pass";
        final String FAIL = "Fail";
        // Variable declaration
        double inputGPA;

        // User input
        System.out.print("Enter GPA: ");
        inputGPA = input.nextDouble();

        // Conditional statement and output
        if (inputGPA >= 2.5) {
            System.out.println("Award: " + MERIT);
        } else if (inputGPA >= 2.0 && inputGPA < 2.49) {
            System.out.println("Award: " + PASS);
        } else {
            System.out.println("Award: " + FAIL);
        } // if-else
    }// Main
}// Class - Ex1
