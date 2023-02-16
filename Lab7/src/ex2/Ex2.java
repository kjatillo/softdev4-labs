package ex2;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 16/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Ex2 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Array
        double[][] rainfallData = new double[2][3];
        // Variable
        double userInput;

        // User input
        for (int area = 0; area < rainfallData.length; area++) {
            for (int month = 0; month < rainfallData[area].length; month++) {
                System.out.printf("Rainfall for month %d in area %d: ", month + 1, area + 1);
                userInput = input.nextDouble();
                rainfallData[area][month] = userInput;
            }// inner for loop
        }// outer for loop

        // Calculating average
        double[] averageList = new double[rainfallData.length];
        for (int region = 0; region < rainfallData.length; region++) {
            double sumData = 0;
            double average;

            for (int data = 0; data < rainfallData[region].length; data++) {
                sumData += rainfallData[region][data];
            }// inner for loop
            average = sumData / rainfallData[region].length;
            averageList[region] = average;
        }// outer for loop

        // Output
        System.out.printf("%n%-8s%-8s%-8s%-8s%-20s%n", "Region", "Jan", "Feb", "Mar", "Average Rainfall");
        for (int region = 0; region < rainfallData.length; region++) {
                System.out.printf("%-8s", region + 1);
            for (int data = 0; data < rainfallData[region].length; data++) {
                System.out.printf("%-8.2f", rainfallData[region][data]);
            }// inner for loop
            System.out.printf("%-20.2f\n", averageList[region]);
        }// outer for loop
    }// Main
}// Class - Ex2
