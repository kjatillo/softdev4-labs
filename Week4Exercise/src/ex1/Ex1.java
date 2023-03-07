package ex1;

/**
 * Created by: Ken
 * Created on: 14/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Ex1 {
    public static void main(String[] args) {
        // Array
        double[][] rates = {
                {10.5, 12.0, 14.5, 16.75, 18.0},
                {20.5, 22.25, 24.0, 26.25,28.0},
                {34.0, 36.5, 38.0, 40.35, 43.0},
                {50.0, 60.0, 70.0, 80.0, 99.0}
            };
        // Variable
        double sum = 0;
        double average;

        // Iteration
        for (int row = 0; row < rates.length; row++) {
            for (int col = 0; col < rates[row].length; col++) {
                sum += rates[row][col];
            }// inner for loop
            if (row == 0) {
                average = sum / rates[row].length;  // Calculate average

                // Output
                System.out.println("Sum of Grade 1 Programmer: " + sum);
                System.out.println("Average of Grade 1 Programmer: " + average);
            }// for loop
        }// outer for loop

        double max;
        double min;
        double difference;

        for (int i = 0; i < rates.length; i++) {
            max = rates[i][0];
            min = rates[i][0];
            for (int j = 0; j < rates[i].length; j++) {
                if (rates[i][j] < min)
                    min = rates[i][j];

                if (rates[i][j] > max)
                    max = rates[i][j];
            }// inner for loop
            difference = max - min;
            System.out.printf("Difference better lowest/highest pay for skill level %d is %.2f\n",
                    (i + 1), difference);
        }// outer for loop
    }// Main
}// Class - Ex1
