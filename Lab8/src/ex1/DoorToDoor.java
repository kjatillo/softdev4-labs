package ex1;

/**
 * Created by: Ken
 * Created on: 18/02/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class DoorToDoor {
    // Array
    private final int[] houses;
    private final int[] sales;

    public DoorToDoor(int numHouses) {
        houses = new int[numHouses];
        sales = new int[numHouses];
    }// Constructor - DoorToDoor

    public void fillHouses() {
        for (int num = 0; num < houses.length; num++) {
            houses[num] = num + 1;
        }// for loop
    }// Method = fillHouses

    public void fillSales(int houseNum, int saleQty) {
        // User input for house number start at 1
        sales[houseNum - 1] = saleQty;  // Subtracting 1 from user input to match index
    }// Method - fillSales

    public void displayALl() {
        System.out.printf("%-10s%-10s\n", "House #", "Sales");
        for (int i = 0; i < houses.length; i++) {
            System.out.printf("%-10d%-10d\n", houses[i], sales[i]);
        }// for loop
    }// Method - displayAll

    public double calcAverageSales() {
        double totalSales = 0;

        for (int sale : sales) {
            totalSales += sale;
        }// for loop

        return totalSales / sales.length;
    }// Method - calcAverageSales

    public void minSales() {
        // Variables
        int minSaleValue = sales[0];
        int indexHouseNum = 0;

        // Determine minimum sale value
        for (int sale = 0; sale < sales.length; sale++) {
            if (sales[sale] < minSaleValue) {
                minSaleValue = sales[sale];
                indexHouseNum = sale;
            }// if statement
        }// for loop
        // Output
        System.out.println("[Minimum Sales]");
        System.out.println("House Number: " + (indexHouseNum + 1));
        System.out.println("Min Sales Value: " + minSaleValue);
    }// Method - minSales

    public void sortSalesArray() {
        // Variable
        int temp;

        // Sorting sales in descending order
        for (int i = 0; i < sales.length - 1; i++) {
            for (int index = 0; index < ((sales.length - 1) - i); index++) {
                if (sales[index] < sales[index + 1]) {
                    temp = sales[index];
                    sales[index] = sales[index + 1];
                    sales[index + 1] = temp;
                }// if statement
            }// inner for loop
        }// outer for loop
        // Output
        System.out.println("[Sales in Descending Order]");
        for (int sale: sales)
            System.out.println(sale);
    }// Method - sortSalesArray
}// Class - DoorToDoor
