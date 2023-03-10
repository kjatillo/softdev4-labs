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
            return "No seat description.";
        }// if-else
    }// Method - getSeatDescription

    @Override
    public void calculateCost() {
        double baseCost = 100.0;
        double firstClassRate = 0.55;
        double economyClassRate = 0.15;
        double costPerMile;

        if (isFirstClass) {
            costPerMile = getMiles() * firstClassRate;
            setCost(baseCost + costPerMile);
        } else {
            costPerMile = getMiles() * economyClassRate;
            setCost(baseCost + costPerMile);
        }// if-else
    }// Method - calculateCost
}// Class - Flight
