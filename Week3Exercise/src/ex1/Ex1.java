package ex1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 07/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Ex1 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Variable declaration
        final int SENTINEL = 0;
        String houseName;
        int sleepHours;
        int sumSleepHours = 0;
        int dataCount = 0;

        // User input
        System.out.print("Please enter house name: ");
        houseName = input.nextLine();

        System.out.print("Please enter the sleep hours (0 to stop): ");
        sleepHours = input.nextInt();

        while (sleepHours != SENTINEL) {
            System.out.print("Please enter the sleep hours (0 to stop): ");
            sleepHours = input.nextInt();

            sumSleepHours += sleepHours;
            dataCount++;
        }// while-loop

        // Calculate average sleep
        double sleepAverage = (double) sumSleepHours / (double) dataCount;

        // Output
        System.out.println("\nHouse Name: " + houseName);
        System.out.printf("Average: %.2f", sleepAverage);
    }// Main
}// Class - Ex1
