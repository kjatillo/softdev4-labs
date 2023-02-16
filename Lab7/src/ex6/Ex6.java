package ex6;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 16/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Ex6 {
    public static void main(String[] args) {
        // Declare variables
        int[] numsArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int answer;
        int correct = 0;
        int wrong = 0;
        int total = 0;
        int randomNum;
        // Scanner
        Scanner input = new Scanner(System.in);

        // Loop until 3 wrong answers
        while (wrong < 3) {
            // Generate random numbers
            randomNum = (int) (Math.random() * 12);

            // Ask question
            System.out.print("What is " + 1 + " + " + numsArray[randomNum] + "? ");
            answer = input.nextInt();

            // Check answer
            if (answer == 1 + numsArray[randomNum]) {
                System.out.println("Correct!");
                correct++;
            } else {
                System.out.println("Wrong!");
                wrong++;
            }
            total++;
        }// while loop
        // Output
        System.out.println();
        System.out.println("Sorry, you have answered 3 questions incorrectly.");
        System.out.println("You got " + correct + " out of " + total + " correct.");
    }// Main
}// Class - Ex6
