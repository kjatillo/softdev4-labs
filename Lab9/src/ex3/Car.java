package ex3;

public class Car extends Rental {
    private boolean sports;

    public Car(String rentalName, int rentalPeriod, boolean sports) {
        super(rentalName, rentalPeriod);
        this.sports = sports;
    }// Constructor - Car

    @Override
    public double calculateCost() {
        final double RATE_SPORTS_CAR = 75.0;
        final double RATE_NON_SPORTS_CAR = 50.0;

        if (sports) {
            return getRentalPeriod() * RATE_SPORTS_CAR;
        } else {
            return getRentalPeriod() * RATE_NON_SPORTS_CAR;
        }// if-else
    }// Method calculateCost
}// Class - Car
