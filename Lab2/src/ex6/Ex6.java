package ex6;

/**
 * Created by: Ken
 * Created on: 27/01/2023
 */

public class Ex6 {
    public static void main(String[] args) {
        // Constant variable declaration & initiation
        final double WIDTH_IN_INCH = 8.5;
        final double LENGTH_IN_INCH = 11;
        final double MM_IN_INCH = 25.4;
        // Calculation
        double width_in_mm = WIDTH_IN_INCH * MM_IN_INCH;
        double length_in_mm = LENGTH_IN_INCH * MM_IN_INCH;

        // Output
        System.out.println("Perimetres in inches: " + 2 * (WIDTH_IN_INCH + LENGTH_IN_INCH));
        System.out.printf("Perimetres in mm: %.2f", (2 * (width_in_mm + length_in_mm)));
    }// Main
}// Class - Ex6
