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

    public TravelBooking(String destination, int miles) {
        this.destination = destination;
        this.miles = miles;
    }// Constructor - TravelBooking

    public void setCost(double cost) {
        this.cost = cost;
    }// Setting - setCost

    public void setMiles(int miles) {
        this.miles = miles;
    }// Setting - setMiles

    public double getCost() {
        return cost;
    }// Getter - getCost

    public int getMiles() {
        return miles;
    }// Getter - getMiles

    public abstract void calculateCost();  // Abstract method - calculateCost
}// Class - TravelBooking
