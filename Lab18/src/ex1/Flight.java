package ex1;

import java.text.DecimalFormat;

/**
 * Created by: Ken
 * Created on: 31/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Flight {
    private int capacity;
    private double flightDuration;
    private Passenger[] passengerList;

    public Flight(int capacity, double flightDuration) {
        this.capacity = capacity;
        this.flightDuration = flightDuration;
        passengerList = new Passenger[4];
    }// Constructor - Flight

    public void fillList(Passenger passenger, int index) {
        passengerList[index] = passenger;
    }// Method - fillList

    public void printList() {
        DecimalFormat df = new DecimalFormat("##0.00");

        for (Passenger passenger: passengerList) {
            System.out.println("\nPassenger Name: " + passenger.getName());
            System.out.println("Passenger Age: " + passenger.getAge());
            System.out.println("Baggage Charge: €" + df.format(passenger.calcBaggageCharge()));
        }// for
    }// Method - printList

    public int checkAvailability() {
        return capacity - passengerList.length;
    }// Method/Getter - checkAvailability

    public String calcOldestPassenger() {
        int max_age = Integer.MIN_VALUE;
        String oldestPassengerName = null;

        for (Passenger passenger: passengerList) {
            if (passenger.getAge() > max_age) {
                max_age = passenger.getAge();
                oldestPassengerName = passenger.getName();
            }// if
        }// for

        return oldestPassengerName;
    }// Method - calcOldestPassenger
}// Class - Flight
