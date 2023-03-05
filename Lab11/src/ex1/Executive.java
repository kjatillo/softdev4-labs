package ex1;

/**
 * Created by: Ken
 * Created on: 05/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Executive extends Employee {
    private double bonus;

    public Executive(String name, String address, String phoneNumber, String rsiNumber, double payRate) {
        super(name, address, phoneNumber, rsiNumber, payRate);
        bonus = 0;
    }// Constructor - Executive

    public void awardBonus(double bonusAmount) {
        bonus += bonusAmount;
    }// Method - awardBonus

    @Override
    public double pay() {
        return payRate + bonus;
    }// Method - pay
}// Class - Executive
