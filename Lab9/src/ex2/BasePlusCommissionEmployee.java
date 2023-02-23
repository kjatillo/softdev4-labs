package ex2;

/**
 * Created by: Ken
 * Created on: 23/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private final double baseSalary;
    private double earnings;

    public BasePlusCommissionEmployee
            (String firstName, String lastName, String socialSecurityNumber,
             double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }// Constructor - BasePlusCommissionEmployee

    public void calcEarnings() {
        earnings = super.calcCommission() + baseSalary;
    }// Method calcEarnings

    public double getEarnings() {
        return earnings;
    }// Getter - earnings
}// Class - BasePlusCommissionEmployee
