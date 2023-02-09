package ex1;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 09/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Ex1 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        int userOption;
        double radius;
        double height;
        double length;

        // Header
        System.out.println("<< Calculation of Volume for Solid Objects >>");
        System.out.println("[1] Cube");
        System.out.println("[2] Cylinder");
        System.out.println("[3] Sphere");
        System.out.println("[4] Exit");

        // User input
        System.out.print("Option: ");
        userOption = input.nextInt();

        while (userOption != 4) {
            switch (userOption) {
                case 1 -> {
                    System.out.print("Enter the height of the cube: ");
                    length = input.nextDouble();

                    double volumeOfCube = length * length * length;
                    System.out.printf("Volume of Cube: %.2f\n", volumeOfCube);
                }
                case 2 -> {
                    System.out.print("Enter the radius of the cylinder: ");
                    radius = input.nextDouble();
                    System.out.print("Enter the height of the cylinder: ");
                    height = input.nextDouble();

                    double volumeOfCylinder = Math.PI * Math.pow(radius, 2) * height;
                    System.out.printf("Volume of Cylinder: %.2f\n", volumeOfCylinder);
                }
                case 3 -> {
                    System.out.print("Enter the radius of the sphere: ");
                    radius = input.nextDouble();

                    double volumeOfSphere = (4 / 3.0) * Math.PI * Math.pow(radius, 3);
                    System.out.printf("Volume of Sphere: %.2f\n", volumeOfSphere);
                }
                default -> System.out.println("Invalid input! Please enter a number from the options list.");
            }// switch
            // Header
            System.out.println("<< Calculation of Volume for Solid Objects >>");
            System.out.println("[1] Cube");
            System.out.println("[2] Cylinder");
            System.out.println("[3] Sphere");
            System.out.println("[4] Exit");

            // User input
            System.out.print("\nOption: ");
            userOption = input.nextInt();
        }// while
        System.out.println("Program terminated! See you again.");
    }// Main
}// Class - Ex1
