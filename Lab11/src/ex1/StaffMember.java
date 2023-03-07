package ex1;

/**
 * Created by: Ken
 * Created on: 05/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phoneNumber;

    public StaffMember(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }// Constructor - StaffMember

    public String toString() {
        return String.format("Name: %s\nAddress: %s\nPhone: %s", name, address, phoneNumber);
    }// Method - toString

    public abstract double pay();  // Abstract method - pay
}// Abstract Class - StaffMember
