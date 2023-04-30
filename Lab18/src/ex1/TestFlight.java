package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 30/04/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class TestFlight {
    public static void main(String[] args) {
        // Create Flight object
        Flight flight = new Flight(200, 3.5);
        String name = null;
        int age = 0;
        double[] bagWeightList;
        char[] bagSizeList;
        int bw;
        int bs;
        int counter = 0;

        File file = new File("files", "data.txt");
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                bagWeightList = new double[3];
                bagSizeList = new char[3];
                bw = 0;
                bs = 0;

                String line = fileScanner.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter(",");
                while (lineScanner.hasNext()) {
                    name = lineScanner.next();
                    age = lineScanner.nextInt();
                    bagWeightList[bw++] = lineScanner.nextDouble();
                    bagWeightList[bw++] = lineScanner.nextDouble();
                    bagWeightList[bw] = lineScanner.nextDouble();
                    bagSizeList[bs++] = lineScanner.next().charAt(0);
                    bagSizeList[bs++] = lineScanner.next().charAt(0);
                    bagSizeList[bs] = lineScanner.next().charAt(0);
                }// inner while
                Passenger passenger = new Passenger(name, age, bagWeightList, bagSizeList);
                flight.fillList(passenger, counter);
                counter++;
            } // outer while
        } catch(FileNotFoundException e){
            System.out.println("Problem: " + e.getMessage());
        }// try-catch

        System.out.println("[ Passenger List for Flight ]");
        flight.printList();
        System.out.println("\nNumber seats available: " + flight.checkAvailability());
        System.out.println("Oldest passenger: " + flight.calcOldestPassenger());
    }// Method - main
}// Class - TestFlight
