package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by: Keneith Atillo
 * Created on: 02/05/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class TestVehicle {
    public static void main(String[] args) {
        // Variables
        String make;
        String model;
        double purchasePrice;
        double shippingCost;
        char port;
        double sellingPrice;
        // Objects
        Scanner scanner = new Scanner(System.in);
        VehicleDB vehicle = new VehicleDB();
        File file = new File("files", "vehicles.txt");

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter(",");
                while (lineScanner.hasNext()) {
                    make = lineScanner.next();
                    model = lineScanner.next();
                    purchasePrice = Double.parseDouble(lineScanner.next());
                    shippingCost = Double.parseDouble(lineScanner.next());
                    port = lineScanner.next().charAt(0);
                    sellingPrice = Double.parseDouble(lineScanner.next());
                    vehicle.addVehicle(make, model, purchasePrice, shippingCost, port, sellingPrice);
                }// inner while
            }// outer while
        } catch (FileNotFoundException err) {
            System.out.println(err.getMessage());
        }// try-catch

        boolean selectingOption = true;
        while (selectingOption) {
            System.out.println("[1] View the vehicles");
            System.out.println("[2] View the most expensive vehicle(s)");
            System.out.println("[3] View the import duty");
            System.out.println("[4] Sort the vehicles and display the sorted list");
            System.out.println("[5] Quit");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1: {
                    vehicle.displayList();
                    break;
                }// case 1
                case 2: {
                    vehicle.calcMostExpensive();
                    break;
                }// case 2
                case 3: {
                    vehicle.calcImportDuty();
                    break;
                }// case 3
                case 4: {
                    vehicle.sortVehicles();
                    vehicle.displayList();
                    break;
                }// case 4
                case 5: {
                    System.out.println("\nProgram terminated. Goodbye!");
                    selectingOption = false;
                    break;
                }// case 5
                default:
                    System.out.println("Invalid input! Choose an option from the menu.");
            }// switch
            System.out.print("\nPress enter to continue...");
            scanner.nextLine();
        }// while
    }// Method - main
}// Class - TestVehicle
