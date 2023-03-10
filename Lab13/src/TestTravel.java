import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 07/03/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class TestTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] cruiseSchedule = {
                {true, false, false, false, false, false, false},
                {false, true, false, false, false, false, false},
                {false, false, true, false, false, false, false}
        };
        Flight f1 = null;
        Cruise c1 = null;
        int option;
        int seatType;
        boolean classChoice = false;

        System.out.println("----------------------------------------");
        System.out.println("[Travel System]");
        System.out.println("----------------------------------------");
        System.out.println("Number of travel booking made: " + TravelBooking.getNumBookings());

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("[New Travel Booking]");
        System.out.println("----------------------------------------");
        System.out.println("[1] Flight");
        System.out.println("[2] Cruise");
        System.out.println("[3] Exit");
        System.out.println("----------------------------------------");
        System.out.print("Option: ");
        option = scanner.nextInt();

        while (option != 3) {
            String destination;
            String classOption;
            int distance;
            switch (option) {
                case 1 -> {
                    System.out.print("\nEnter the destination: ");
                    destination = scanner.nextLine();
                    scanner.nextLine();

                    System.out.print("Enter the flight distance: ");
                    distance = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Do you wish to upgrade to first class? (Yes/No): ");
                    classOption = scanner.nextLine();
                    if (classOption.equalsIgnoreCase("yes")) {
                        classChoice = true;
                    } else if (classOption.equalsIgnoreCase("no")) {
                        classChoice = false;
                    } else {
                        System.out.println("Invalid input!");
                    }// if-else

                    System.out.print("Enter seat type (0 for Aisle, 1 for Window or 2 for Middle): ");
                    seatType = scanner.nextInt();

                    f1 = new Flight(destination, distance, classChoice, seatType);
                    f1.getSeatDescription();
                    f1.calculateCost();
                    System.out.printf("\nFlight cost: €%.2f\n", f1.getCost());
                    System.out.println("You have been allocated a " + f1.getSeatDescription() + " seat");
                }// case - 1
                case 2 -> {
                    System.out.print("\nEnter destination: ");
                    destination = scanner.nextLine();
                    scanner.nextLine();

                    System.out.print("Enter the cruise distance: ");
                    distance = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Do you want a cabin with balcony? (Yes/No): ");
                    classOption = scanner.nextLine();
                    if (classOption.equalsIgnoreCase("yes")) {
                        classChoice = true;
                    } else if (classOption.equalsIgnoreCase("no")) {
                        classChoice = false;
                    } else {
                        System.out.println("Invalid input!");
                    }// if-else

                    c1 = new Cruise(destination, distance, classChoice);
                    c1.populateTourSchedule(cruiseSchedule);
                    c1.calculateCost();
                    System.out.printf("\nThe cruise will cost €%.2f\n", c1.getCost());
                    c1.checkTourSchedule();
                }// case - 2
                default -> System.out.println("Invalid input!");
            }// switch

            System.out.println();
            System.out.println("----------------------------------------");
            System.out.println("[New Travel Booking]");
            System.out.println("----------------------------------------");
            System.out.println("[1] Flight");
            System.out.println("[2] Cruise");
            System.out.println("[3] Exit");
            System.out.println("----------------------------------------");
            System.out.print("Option: ");
            option = scanner.nextInt();
        }// while

        if (f1 != null && c1 != null) {
            System.out.println("Number of travel booking made: " + TravelBooking.getNumBookings());
            calculateMostExpensiveTrip(f1, c1);
        }// if
    }// Main

    public static void calculateMostExpensiveTrip(Flight f1, Cruise c1) {
        if (f1.getCost() > c1.getCost()) {
            System.out.printf("The flight is more expensive than the cruise by €%.2f\n", (f1.getCost() - c1.getCost()));
        } else {
            System.out.printf("The cruise is more expensive than the flight by €%.2f\n", (c1.getCost() - f1.getCost()));
        }// if-else
    }// Method - calculateMostExpensiveTrip
}// Class - TestTravel
