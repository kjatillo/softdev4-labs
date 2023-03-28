package ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 28/03/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class TestPay {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);
        // Variables
        final double RATE = 10.0;
        int hoursWorked;
        double amount;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter hours worked: ");
                hoursWorked = scanner.nextInt();

                if (hoursWorked < 0) {
                    throw new NegativeHoursException();
                }// if

                amount = hoursWorked * RATE;
                System.out.println("You earned €" + amount + " today.");
                validInput = true;
            } catch (InputMismatchException err) {
                System.out.println("Invalid data entered!");
                scanner.nextLine();
            } catch (NegativeHoursException n) {
                System.out.println(n.getMessage());
                scanner.nextLine();
            }// try-catch
        }// while
    }// Main
}// Class - TestPay
