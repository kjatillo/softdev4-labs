/**
 * Created by: Ken
 * Created on: 07/03/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Flight extends TravelBooking {
    final String[] SEAT_DESCRIPTIONS = {"Aisle", "Window", "Middle"};
    int seatType;
    boolean isFirstClass;

    public Flight(String destination, int miles, boolean isFirstClass, int seatType) {
        super(destination, miles);
        this.isFirstClass = isFirstClass;
        this.seatType = seatType;
    }// Constructor - Flight

    public String getSeatDescription() {
        if (seatType == 0) {
            return SEAT_DESCRIPTIONS[0];
        } else if (seatType == 1) {
            return SEAT_DESCRIPTIONS[1];
        } else if (seatType == 3) {
            return SEAT_DESCRIPTIONS[3];
        } else {
            return "Invalid input! Enter 0 for Aisle, 1 for Window or 3 for Middle seat.";
        }// if-else
    }// Method - getSeatDescription

    @Override
    public void calculateCost() {
        double baseCost = 100.0;
        double firstClassRate = 55;
        double economyClassRate = 15;
        double costInMiles;

        if (isFirstClass) {
            costInMiles = getMiles() * firstClassRate;
            setCost(baseCost + costInMiles);
        } else {
            costInMiles = getMiles() * economyClassRate;
            setCost(baseCost + costInMiles);
        }// if-else
    }// Method - calculateCost
}// Class - Flight
