package ex2;

/**
 * Created by: Ken
 * Created on: 31/01/2023
 */

public class Ex2 {
    public static void main(String[] args) {
        // Variable declaration and initialisation
        int num1 = 24;
        int num2 = 12;
        int num3 = 1;
        int smallestNum;

        // Conditional statement
        if (num1 < num2 && num1 < num3) {
            smallestNum = num1;
        } else if (num2 < num1 && num2 < num3) {
            smallestNum = num2;
        } else {
            smallestNum = num3;
        }// if-else

        // Output
        System.out.println("Smallest Number: " + smallestNum);
    }// Main
}// Class - Ex2
