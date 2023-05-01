/**
 * Created by: Ken
 * Created on: 01/05/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Book extends Goods implements Taxable{
    private String author;

    public Book(String description, double price, String author) {
        super(description, price);
        this.author = author;
    }// Constructor

    public void print() {
        super.print();
        System.out.println("Author: " + author);
        System.out.printf("Tax: €%.2f\n", calculateTax());
    }// Method - print

    public double calculateTax() {
        return getPrice() * TAXRATE;
    }// Method - calculateTax
}// Class - Book
