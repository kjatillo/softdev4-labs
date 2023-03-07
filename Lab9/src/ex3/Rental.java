package ex3;

public abstract class Rental {
    private String rentalName;
    private int rentalPeriod;

    public Rental(String rentalName, int rentalPeriod) {
        this.rentalName = rentalName;
        this.rentalPeriod = rentalPeriod;
    }// Constructor - Rental

    public int getRentalPeriod() {
        return rentalPeriod;
    }// Getter - rentalPeriod

    // Abstract Method
    public abstract double calculateCost();

    public void displayDetails() {
        System.out.printf("%s has a rental period of %d days\n", rentalName, rentalPeriod);
    }// Method - displayDetails
}// Abstract Class - Rental
