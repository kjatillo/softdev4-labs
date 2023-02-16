package ex1;

/**
 * Created by: Ken
 * Created on: 16/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Ex1 {
    public static void main(String[] args) {
        // Array
        double[][] m = {
                {6.7, 4.4, 7.9, 9.2, 7.1},
                {9.0, 6.7, 3.3, 2.7, 20.1}
        };
        double[][] balances = new double[2][5];

        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                balances[row][col] = m[row][col];
            }// inner for loop
        }// outer for loop

        // Calculating total
        double total = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < 5; j++) {
                total += balances[i][j];
            }// inner for loop
        }// outer for loop

        System.out.println("Total: " + total);
    }// Main
}// Class - Ex1
