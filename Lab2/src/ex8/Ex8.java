package ex8;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 27/01/2023
 */

public class Ex8 {
    public static void main(String[] args) {
        // Variable declaration
        Scanner input = new Scanner(System.in);
        double num1;
        double num2;
        double num3;

        // User input
        System.out.print("Enter first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        num2 = input.nextDouble();
        System.out.print("Enter third number: ");
        num3 = input.nextDouble();

        // Calculate average
        double average = (num1 + num2 + num3) / 3;

        // Output
        System.out.printf("The average of %.2f, %.2f and %.2f is %.2f", num1, num2, num3, average);
    }// Main
}// Class - Ex8
