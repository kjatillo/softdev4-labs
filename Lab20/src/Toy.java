/**
 * Created by: Ken
 * Created on: 01/05/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Toy extends Goods implements Taxable {
    private int minAge;

    public Toy(String description, double price, int minAge) {
        super(description, price);
        this.minAge = minAge;
    }// Constructor

    public void print() {
        super.print();
        System.out.println("Minimum age: " + minAge);
        System.out.printf("Tax: €%.2f\n", calculateTax());
    }// Method - print

    public double calculateTax() {
        return getPrice() * TAXRATE;
    }// Method - calculateTax
}// Class - Toy
