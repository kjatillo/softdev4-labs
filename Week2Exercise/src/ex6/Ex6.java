package ex6;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 31/01/2023
 */

public class Ex6 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Variable declaration
        String word1;
        String word2;
        String word3;

        // User input
        System.out.print("Enter first word: ");
        word1 = input.nextLine();

        System.out.print("Enter second word: ");
        word2 = input.nextLine();

        System.out.print("Enter third word: ");
        word3 = input.nextLine();

        // Output
        System.out.println("Acronym: " + word1.charAt(0) + word2.charAt(0) + word3.charAt(0));
    }// Main
}// Class - Ex6
