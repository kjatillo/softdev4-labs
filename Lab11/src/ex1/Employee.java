package ex1;

/**
 * Created by: Ken
 * Created on: 05/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Employee extends StaffMember {
    private String rsiNumber;
    protected double payRate;

    public Employee(String name, String address, String phoneNumber, String rsiNumber, double payRate) {
        super(name, address, phoneNumber);
        this.rsiNumber = rsiNumber;
        this.payRate = payRate;
    }// Constructor - Employee

    @Override
    public String toString() {
        String str = super.toString();
        str += "\nRSI Number: " + rsiNumber;

        return str;
    }// Method - toString

    @Override
    public double pay() {
        return payRate;
    }// Method - pay
}// Class - Employee
