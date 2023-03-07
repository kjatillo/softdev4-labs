package ex1;

/**
 * Created by: Ken
 * Created on: 05/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Volunteer extends StaffMember {
    public Volunteer(String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
    }// Constructor - Volunteer

    @Override
    public double pay() {
        return 0;
    }// Method - pay

    @Override
    public String toString() {
        return super.toString();
    }// Method - toString
}// Class - Volunteer
