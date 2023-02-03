package ex5;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 03/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Ex5 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Variable declaration
        double hourlyRate = 10.0;
        double pay;
        int start;
        int finish;
        int hoursWorked;
        int breakTime = 1;

        // User input
        System.out.print("Enter the start time (24H Format): ");
        start = input.nextInt();

        System.out.print("Enter the finish time (24H Format): ");
        finish = input.nextInt();

        // Calculation/Output
        if (start >= 0 && finish <= 2400) {
            hoursWorked = (finish - start) / 100;
            pay = (hoursWorked - breakTime) * hourlyRate;

            System.out.printf("Amount earned today: €%.2f", pay);
        } else {
            System.out.println("Invalid input! Working time is between 0000 to 2400");
        }// if-else
    }// Main
}// Class
