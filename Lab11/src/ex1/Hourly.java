package ex1;

/**
 * Created by: Ken
 * Created on: 05/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Hourly extends Employee {
    private int hoursWorked;

    public Hourly(String name, String address, String phoneNumber, String rsiNumber, double payRate) {
        super(name, address, phoneNumber, rsiNumber, payRate);
        hoursWorked = 0;
    }// Constructor - Hourly

    public void addHours(int numHours) {
        hoursWorked += numHours;
    }// Method - addHours

    @Override
    public double pay() {
        double basePay;
        double overtimePay;
        int overtimeHours;

        if (hoursWorked > 40) {
            overtimeHours = hoursWorked - 40;
            overtimePay = overtimeHours * (payRate * 1.5);
            basePay = (hoursWorked - overtimeHours) * payRate;

            return basePay + overtimePay;
        } else {
            return hoursWorked * payRate;
        }// if-else
    }// Method - pay

    @Override
    public String toString() {
        String str = super.toString();
        str += String.format("\nCurrent hours: %d", hoursWorked);

        return str;
    }// Method - toString
}// Class - Hourly
