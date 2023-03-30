/**
 * Student Name: Keneith Atillo
 * Student Number: X00190944
 * */

package ex1;

public abstract class Rental {
    private String title;
    private int year;

    public Rental(String title, int year) {
        this.title = title;
        this.year = year;
    }// Constructor - Rental

    public String toString() {
        return "Title: " + title + "\nYear: " + year + "\n";
    }// Method - toString

    public abstract void processReturn();  // Abstract method
}// Class - Rental
