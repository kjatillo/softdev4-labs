package ex3;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 03/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Ex3 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Variable declaration
        int inputRadius;

        // User input
        System.out.print("Enter the radius: ");
        inputRadius = input.nextInt();

        // Calculation
        double areaOfCircle = Math.PI * (inputRadius * inputRadius);

        // Output
        if (inputRadius >= 0) {
            System.out.printf("\nThe area of the circle is: %.2f", areaOfCircle);
        } else {
            System.out.println("Invalid input! Negative radius.");
        }// if-else
    }// Main
}// Class - Ex3
