package ex2;

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
        if ((addQty + inStock) <= maxQty)
            inStock += addQty;
    }// Method - takeOnStock

    public void issueStock(int deductQty) {
        if ((inStock - deductQty) > 0 && (inStock - deductQty) > minQty)
            inStock -= deductQty;
    }// Method - issueStock

    public int getInStock() {
        return inStock;
    }// Getter - getInStock
}// Class - StockItem
