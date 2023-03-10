/**
 * Student Name: Keneith Atillo
 * Student Number: X00190944
 * */

package ex1;

public class Book extends Rental {
    private String author;
    private String isbn;
    private int stockQuantity;
    private int checkedOutQuantity;

    public Book(String title, int year, String author, String isbn, int stockQuantity, int checkedOutQuantity) {
        super(title, year);
        this.author = author;
        this.isbn = isbn;
        this.stockQuantity = stockQuantity;
        this.checkedOutQuantity = checkedOutQuantity;
    }// Constructor - Book

    public int getStockQuantity() {
        return stockQuantity;
    }// Getter - getStockQuantity

    @Override
    public String toString() {
        String str = super.toString();
        str += "Author: " + author + "\nISBN: " + isbn + "\nQuantity in Stock: " + stockQuantity +
                "\nQuantity Checked Out: " + checkedOutQuantity + "\n";

        return str;
    }// Method - toString

    @Override
    public void processReturn() {
        final int MAX_NUM_BOOK = 5;
        if (stockQuantity < MAX_NUM_BOOK) {
            stockQuantity += 1;
            checkedOutQuantity -= 1;
        } else {
            System.out.println("Book does not belong to this library!");
        }// if-else
    }// Method - processReturn

    public void checkout() {
        stockQuantity -= 1;
        checkedOutQuantity += 1;
    }// Method - checkout
}// Class - Book
