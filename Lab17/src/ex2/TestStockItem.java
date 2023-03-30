package ex2;

/**
 * Created by: Ken
 * Created on: 30/03/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class TestStockItem {
    public static void main(String[] args) {
        StockItem item = new StockItem(123, "Shampoo", 100, 10, 25);

        try {
            item.takeOnStock(80);

            throw new OverMaxException();
        } catch (OverMaxException err) {
            System.out.println(err.getMessage());
        }

        try {
            item.issueStock(30);

            throw new OutOfStockException();
        } catch (OutOfStockException err) {
            System.out.println(err.getMessage());
        }// try-catch

        try {
            item.issueStock(20);

            throw new BelowMinException();
        } catch (BelowMinException err) {
            System.out.println(err.getMessage());
        }// try-catch

        System.out.println("Stock: " + item.getInStock());
    }// Main
}// Class - TestStockItem
