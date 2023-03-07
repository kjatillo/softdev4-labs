package ex8;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 31/01/2023
 */

public class Ex8 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Variable declaration
        String emailAddress;

        // User input
        System.out.print("Enter Email Address: ");
        emailAddress = input.nextLine();

        // Conditional statement
        if (emailAddress.length() > 0 && emailAddress.contains("@")) {
            System.out.println("Email is valid!");
        } else {
            System.out.println("Invalid email!");
        }// if-else
    }// Main
}// Class - Ex8
