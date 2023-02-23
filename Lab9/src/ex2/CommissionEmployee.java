package ex2;

/**
 * Created by: Ken
 * Created on: 23/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class CommissionEmployee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final double grossSales;
    private final double commissionRate;

    public CommissionEmployee
            (String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales < 0 ? 0 : grossSales;
        this.commissionRate = (commissionRate < 0 || commissionRate > 1.0) ? 0 : commissionRate;
    }// Constructor - CommissionEmployee

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }// Getter - socialSecurityNumber

    public double getGrossSales() {
        return grossSales;
    }// Getter - grossSales

    public double calcCommission() {
        return grossSales * commissionRate;
    }// Method - calcCommission
}// Class - CommissionEmployee
