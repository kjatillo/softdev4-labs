package ex5;

/**
 * Created by: Ken
 * Created on: 16/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Ex5 {
    public static void main(String[] args) {
        // Array
        int[][] gradeTable = {
                {99, 42, 74, 83, 100},
                {88, 61, 74, 89, 96},
                {61, 89, 82, 98, 93},
                {93, 73, 75, 78, 99},
                {50, 65, 92, 87, 94},
                {43, 98, 78, 56, 99}
        };

        System.out.println("Grade [0, 0]: " + gradeTable[0][0]);
        System.out.println("Grade [2, 4]: " + gradeTable[2][4]);

        gradeTable[5][3] = 99;

        int sum = gradeTable[0][1] + gradeTable[0][2];  // Calculating sum
        System.out.println("Sum: " + sum);  // Output

        // Output
        // Grade [0, 0]: 99
        // Grade [2, 4]: 93
        // Sum: 116
    }// Main
}// Class - Ex5
