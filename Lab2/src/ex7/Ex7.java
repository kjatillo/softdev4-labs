package ex7;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 27/01/2023
 */

public class Ex7 {
    public static void main(String[] args) {
        // Variable declaration & initiation
        Scanner input = new Scanner(System.in);
        int length;
        int width;

        // User keyboard input
        System.out.print("Enter length of rectangle: ");
        length = input.nextInt();
        System.out.print("Enter width of rectagle: ");
        width = input.nextInt();

        // Calculation
        int area = width * length;
        int perimeter = 2 * (length + width);

        // Output
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }// Main
}// Class - Ex7
