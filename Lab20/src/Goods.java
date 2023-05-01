/**
 * Created by: Ken
 * Created on: 01/05/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Goods {
    private String description;
    private double price;

    public Goods(String description, double price) {
        this.description = description;
        this.price = price;
    }// Constructor

    public String getDescription() {
        return description;
    }// Getter - description

    public double getPrice() {
        return price;
    }// Getter - price

    public void print() {
        System.out.println("Description: " + description);
        System.out.printf("Price: €%.2f\n", price);
    }// Method - print
}// Class - Goods
