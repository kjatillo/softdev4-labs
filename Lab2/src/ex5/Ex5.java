package ex5;

/**
 * Created by: Ken
 * Created on: 27/01/2023
 */

public class Ex5 {
    public static void main(String[] args) {
        // Constant variable declaration & initiation
        final double WIDTH_IN_INCH = 8.5;
        final double LENGTH_IN_INCH = 11;
        final double mmInInch = 25.4;
        // Calculation
        double width_in_mm = WIDTH_IN_INCH * mmInInch;
        double length_in_mm = LENGTH_IN_INCH * mmInInch;

        // Output
        System.out.printf("Width in mm: %.2f\n", width_in_mm);
        System.out.printf("Length in mm: %.2f", length_in_mm);
    }// Main
}// Class - Ex5
