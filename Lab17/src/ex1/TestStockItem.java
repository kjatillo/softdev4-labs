package ex1;

/**
 * Created by: Ken
 * Created on: 30/03/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class TestStockItem {
    public static void main(String[] args) {
        StockItem item = new StockItem(123, "Shampoo", 100, 10, 25);
        item.takeOnStock(80);
        item.issueStock(30);
        item.issueStock(20);

        System.out.println("Stock: " + item.getInStock());
    }// Main
}// Class - TestStockItem
