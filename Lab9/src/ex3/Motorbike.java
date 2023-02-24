package ex3;

public class Motorbike extends Rental{


    public Motorbike(String rentalName, int rentalPeriod) {
        super(rentalName, rentalPeriod);
    }// Constructor - Motorbike

    @Override
    public double calculateCost() {
        final double RATE_GREATER_10_DAYS = 25.50;
        final double RATE_EQUAL_LESS_10_DAYS = 35.50;

        if (getRentalPeriod() > 10) {
            return getRentalPeriod() * RATE_GREATER_10_DAYS;
        } else {
            return getRentalPeriod() * RATE_EQUAL_LESS_10_DAYS;
        }// if-else
    }// Abstract method - calculateCost
}// Class - Motorbike
