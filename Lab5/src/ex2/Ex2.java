package ex2;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 09/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Ex2 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        int numAssistant = 0;
        int numHoursWorked = 0;
        int countAverageGreaterThan6 = 0;
        int sumHoursWorked = 0;
        int inputDailyHoursWorked;
        double averageDailyHoursWorked;

        while (numAssistant < 3) {
            while (numHoursWorked < 3) {
                System.out.printf("Please enter the hours worked on day %d by research assistant %d: ",
                        (numHoursWorked + 1), numAssistant + 1);
                inputDailyHoursWorked = input.nextInt();
                sumHoursWorked += inputDailyHoursWorked;

                numHoursWorked++;
            }// inner while loop
            averageDailyHoursWorked = sumHoursWorked / 3.0;

            System.out.printf("Research Assistant %d's average hours per day: %.2f\n\n",
                    (numAssistant + 1), averageDailyHoursWorked);

            if (averageDailyHoursWorked > 6.0)
                countAverageGreaterThan6++;

            numAssistant++;
            numHoursWorked = 0;
            sumHoursWorked = 0;
        }// outer while loop
        System.out.println("The number of Research Assistants with an average of greater than six hours is " +
                countAverageGreaterThan6);
    }// Main
}// Class - Ex2
