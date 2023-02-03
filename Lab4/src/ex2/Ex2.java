package ex2;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 03/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Ex2 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        String userInput;

        // User input
        System.out.print("Enter a logical operator: ");
        userInput = input.nextLine();

        // Conditional statement
        switch (userInput) {
            case "&&" -> System.out.printf("'%s' is the logical AND operator.", userInput);
            case "||" -> System.out.printf("'%s' is the logical OR operator.", userInput);
            case "!" -> System.out.printf("'%s' is the logical NOT operator.", userInput);
            default -> System.out.printf("'%s' is not a valid logical operator!", userInput);
        }// Switch
    }// Main
}// Class - Ex2
