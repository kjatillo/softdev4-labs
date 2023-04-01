package ex3;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 30/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class TestMotherBoard {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);
        // Variables
        String manufacturer;
        int memoryCapacity;
        int numMemoryModules;
        MotherBoard.MemoryModule mm = null;

        // User input
        System.out.print("Enter Manufacturer: ");
        manufacturer = scanner.nextLine();
        System.out.print("Enter Memory Size (MB): ");
        memoryCapacity = scanner.nextInt();
        System.out.print("Enter Number of Memory Modules: ");
        numMemoryModules = scanner.nextInt();
        scanner.nextLine();

        // Instance creation
        MotherBoard mobo = new MotherBoard(manufacturer, memoryCapacity, numMemoryModules);
        System.out.println();
        for (int i = 0; i < numMemoryModules; i++) {
            mm = mobo.new MemoryModule(memoryCapacity / numMemoryModules);
        }// for

        // Output
        System.out.println(mobo);
        System.out.println(mm);
    }// Main
}// Class - TestMotherBoard
