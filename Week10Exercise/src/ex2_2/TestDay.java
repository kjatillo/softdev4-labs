package ex2_2;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 28/03/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class TestDay {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);
        // Variable
        String day;

        try {
            System.out.println("Enter a day?");
            day = scanner.nextLine();
            checkDay(day);
            System.out.println("Thank you");
        } catch (InvalidDayException ice) {
            System.out.println(ice.getMessage());
        } finally {
            System.out.println("Bye Bye ");
        }// try-catch-finally
    }// Main

    public static void checkDay(String p) {
        // Variable
        boolean found = false;
        String[] dayList = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        for (String dayList1 : dayList) {
            if (dayList1.equals(p)) {
                found = true;
                break;
            }// if
        }// for

        if (found) {
            System.out.println("Valid");
        } else {
            try {
                throw new InvalidDayException();
            } catch (InvalidDayException err) {
                System.out.println(err.getMessage);
            }
        }// if-else
    }// Method - checkDay
}// Method - TestDay
