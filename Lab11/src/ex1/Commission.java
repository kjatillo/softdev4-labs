package ex1;

/**
 * Created by: Ken
 * Created on: 05/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commission(String name, String address, String phoneNumber, String rsiNumber, double payRate, double commissionRate) {
        super(name, address, phoneNumber, rsiNumber, payRate);
        this.commissionRate = commissionRate;
        totalSales = 0;
    }// Constructor - Commission

    public void addSales(double numSales) {
        totalSales += numSales;
    }// Method - addSales

    @Override
    public double pay() {
        double pay = super.pay();
        double commission = totalSales * commissionRate;
        return pay + commission;
    }// Method - pay

    @Override
    public String toString() {
        String str = super.toString();
        str += String.format("\nTotal Sales: €%.2f", totalSales);

        return str;
    }// Method - toString
}// Class - Commission
