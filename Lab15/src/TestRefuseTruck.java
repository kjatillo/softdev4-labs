import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 23/03/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class TestRefuseTruck {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);
        // Variables
        int numBins = 0;
        double costPerKilogram = 0;
        double binWeight = 0;
        boolean enteringNumBins = true;
        boolean enteringCostPerKilogram = true;
        boolean enteringBinWeight = true;

        while(enteringNumBins) {
            try {
                System.out.print("Enter the number of bins the truck can collect: ");
                numBins = scanner.nextInt();
                enteringNumBins = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a numeric value.");
                scanner.nextLine();
            }// try-catch
        }// while

        while(enteringCostPerKilogram) {
            try {
                System.out.print("Enter the cost per kilo: ");
                costPerKilogram = scanner.nextDouble();
                enteringCostPerKilogram = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a numeric value.");
                scanner.nextLine();
            }// try-catch
        }// while

        // Create RefuseTruck object
        RefuseTruck refuseTruck = new RefuseTruck(numBins, costPerKilogram);

        while(enteringBinWeight) {
            try {
                while(refuseTruck.getNumBinsCollected() < refuseTruck.getMaxBins()) {
                    System.out.print("Enter the weight for bin " + (refuseTruck.getNumBinsCollected() + 1) + " : ");
                    binWeight = scanner.nextDouble();
                    if(refuseTruck.collectBin(binWeight)) {
                        enteringBinWeight = false;
                    }// if
                }// while
                refuseTruck.printStats();
                enteringBinWeight = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a numeric value.");
                scanner.nextLine();
            }// try-catch
        }// while
    }// Main
}// Class - TestRefuseTruck
