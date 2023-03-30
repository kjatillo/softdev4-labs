package ex1;

/**
 * Created by: Ken
 * Created on: 30/03/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class StockItem {
    private int numId;
    private String description;
    private int maxQty;
    private int minQty;
    private int inStock;

    public StockItem(int numId, String description, int maxQty, int minQty, int inStock) {
        this.numId = numId;
        this.description = description;
        this.maxQty = maxQty;
        this.minQty = minQty;
        this.inStock = inStock;
    }// Constructor - StockItem

    public void takeOnStock(int addQty) {
        int newInStockValue = inStock + addQty;

        try {
            if (newInStockValue > maxQty)
                throw new OverMaxException();
        } catch (OverMaxException err) {
            System.out.println(err.getMessage());
        }// try-catch

        if (newInStockValue <= maxQty)
            inStock += addQty;
    }// Method - takeOnStock

    public void issueStock(int deductQty) {
        int newInStockValue = inStock - deductQty;

        try {
            if (newInStockValue <= 0)
                throw new OutOfStockException();

            if (newInStockValue < minQty)
                throw new BelowMinException();

        } catch (OutOfStockException | BelowMinException err) {
            System.out.println(err.getMessage());
        }// try-catch

        if (newInStockValue > 0 && newInStockValue > minQty)
            inStock -= deductQty;
    }// Method - issueStock

    public int getInStock() {
        return inStock;
    }// Getter - getInStock
}// Class - StockItem
