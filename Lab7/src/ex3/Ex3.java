package ex3;

/**
 * Created by: Ken
 * Created on: 16/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Ex3 {
    public static void main(String[] args) {
        // Variable
        int num = 0;
        // Array
        int[][] numsArray = new int[20][20];

        for (int row = 0; row < numsArray.length; row++) {
            for (int col = 0; col < numsArray[row].length; col++) {
                numsArray[row][col] = num;
                num++;
            }// inner for loop
        }// outer for loop

        // Output
        System.out.println("Array Data");
        for (int[] nums : numsArray) {
            for (int n : nums) {
                System.out.printf("%5d", n);
            }// inner for loop
            System.out.println();
        }// outer for loop
    }// Main
}// Class - Ex3
