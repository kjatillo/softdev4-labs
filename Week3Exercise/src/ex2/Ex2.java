package ex2;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 07/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Ex2 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Variable declaration
        final int SENTINEL = -1;
        int inputGrade;
        int totalCountGrades = 0;
        int countGradeA = 0;
        int countGradeB = 0;
        int countGradeC = 0;
        int countGradeD = 0;
        int countGradeF = 0;

        // User input
        System.out.print("Enter Grade (0-100 or -1 to Exit): ");
        inputGrade = input.nextInt();

        while (inputGrade != SENTINEL) {
            if (inputGrade > 0 && inputGrade < 60) {
                countGradeF++;
            } else if (inputGrade < 70) {
                countGradeD++;
            } else if (inputGrade < 80) {
                countGradeC++;
            } else if (inputGrade < 90) {
                countGradeB++;
            } else if (inputGrade <= 100) {
                countGradeA++;
            } else {
                System.out.println("Input out of range! Grade value must only be between 0 and 100 only.");
            }// if-else

            totalCountGrades++;

            System.out.print("Enter Grade (0-100 or -1 to Exit): ");
            inputGrade = input.nextInt();
        }// while-loop

        // Output
        System.out.println("Total Number of Grades: " + totalCountGrades);
        System.out.println("Total Number of A's: " + countGradeA);
        System.out.println("Total Number of B's: " + countGradeB);
        System.out.println("Total Number of C's: " + countGradeC);
        System.out.println("Total Number of D's: " + countGradeD);
        System.out.println("Total Number of F's: " + countGradeF);
    }// Main
}// Class - Ex2
