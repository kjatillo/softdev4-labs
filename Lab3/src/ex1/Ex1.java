package ex1;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 02/02/2023
 */

public class    Ex1 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Variable declaration and initialisation
        final String TYPE_HONDA = "50cc";
        final String TYPE_MOHAWK = "250cc";
        double weekdayBaseRateHonda = 15.00;
        double weekdayHourlyRateHonda = 2.50;
        double weekendBaseRateHonda = 30.00;
        double weekendHourlyRateHonda = 7.50;
        double weekdayBaseRateMohawk = 25.00;
        double weekdayHourlyRateMohawk = 3.50;
        double weekendBaseRateMohawk = 35.00;
        double weekendHourlyRateMohawk = 8.50;
        String inputScooterType;
        String inputWeek;
        int inputHoursRent;
        double fee = 0;

        // User input
        System.out.print("Enter scooter type (50cc/250cc): ");
        inputScooterType = input.nextLine();

        System.out.print("Enter week type (weekday/weekend): ");
        inputWeek = input.nextLine();

        System.out.print("Enter number of hours to rent: ");
        inputHoursRent = input.nextInt();

        // Conditional statement
        if (inputScooterType.equals(TYPE_HONDA)) {
            if (inputWeek.equals("weekday")) {
                if (inputHoursRent > 0 && inputHoursRent <= 3) {
                    fee = weekdayBaseRateHonda;
                } else  if (inputHoursRent > 3){
                    fee += weekdayBaseRateHonda + ((inputHoursRent - 3) * weekdayHourlyRateHonda);
                } else {
                    System.out.println("Invalid input! Value for hours to rent must be greater than 0.");
                }
            } else if (inputWeek.equals("weekend")) {
                if (inputHoursRent > 0 && inputHoursRent <= 3) {
                    fee = weekendBaseRateHonda;
                } else  if (inputHoursRent > 3){
                    fee += weekendBaseRateHonda + ((inputHoursRent - 3) * weekendHourlyRateHonda);
                } else {
                    System.out.println("Invalid input! Value for hours to rent must be greater than 0.");
                }
            }
        } else if (inputScooterType.equals(TYPE_MOHAWK)) {
            if (inputWeek.equals("weekday")) {
                if (inputHoursRent > 0 && inputHoursRent <= 3) {
                    fee = weekdayBaseRateMohawk;
                } else  if (inputHoursRent > 3){
                    fee += weekdayBaseRateMohawk + ((inputHoursRent - 3) * weekdayHourlyRateMohawk);
                } else {
                    System.out.println("Invalid input! Value for hours to rent must be greater than 0.");
                }
            } else if (inputWeek.equals("weekend")) {
                if (inputHoursRent > 0 && inputHoursRent <= 3) {
                    fee = weekendBaseRateMohawk;
                } else  if (inputHoursRent > 3){
                    fee += weekendBaseRateMohawk + ((inputHoursRent - 3) * weekendHourlyRateMohawk);
                } else {
                    System.out.println("Invalid input! Value for hours to rent must be greater than 0.");
                }
            }
        }// if-else

        // Output
        System.out.printf("\nThe fee is %.2f for a scooter ride on a %s for %d on the %s", fee, inputScooterType,
                inputHoursRent, inputWeek);
    }// Main
}// Class - Ex1
