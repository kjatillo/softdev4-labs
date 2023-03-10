/**
 * Created by: Ken
 * Created on: 07/03/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public abstract class TravelBooking {
    private String destination;
    private int miles;
    private double cost;
    private static int numBookings;

    public TravelBooking(String destination, int miles) {
        this.destination = destination;
        this.miles = miles;
        cost = 0;
        numBookings++;
    }// Constructor - TravelBooking

    public double getCost() {
        return cost;
    }// Getter - getCost

    public int getMiles() {
        return miles;
    }// Getter - getMiles

    public void setCost(double cost) {
        this.cost = cost;
    }// Setting - setCost

    public abstract void calculateCost();  // Abstract method - calculateCost

    public static int getNumBookings() {
        return numBookings;
    }// Getter - getNumBookings
}// Class - TravelBooking
