package ex4;

/**
 * Created by: Ken
 * Created on: 16/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Ex4 {
    public static void main(String[] args) {
        // Variable
        int num = 2;
        // Array
        int[][] numsArray = new int[20][2];

        for (int i = 0; i < numsArray.length; i++) {
            numsArray[i][0] = num;
            num += 2;
        }// for loop

        for (int row = 0; row < numsArray.length; row++) {
            if (row == 19) {
                numsArray[row][1] = numsArray[row][0];
            } else {
                numsArray[row][1] = numsArray[row][0] + numsArray[row + 1][0];
            }// if else
        }// for loop

        System.out.printf("%-7s%-7s%-7s\n", "Row", "Col0", "Col1");
        for (int i = 0; i < numsArray.length; i++) {
            System.out.printf("%-7d%-7d%-7d\n", i, numsArray[i][0], numsArray[i][1]);
        }// for loop
    }// Main
}// Class - Ex4
