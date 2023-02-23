package ex2;

import java.text.DecimalFormat;

/**
 * Created by: Ken
 * Created on: 23/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class TestEmployee {
    public static void main(String[] args) {
        // Decimal formal
        DecimalFormat df = new DecimalFormat("#,##0.00");

        CommissionEmployee comEmp = new CommissionEmployee(
                "John", "Smith", "0902001", 20000, .05);
        BasePlusCommissionEmployee comEmpPlus = new BasePlusCommissionEmployee(
                "Mary", "Jones", "0904681", 30000, .06, 500);

        System.out.println("[Commission Employee 1]");
        System.out.println("SSN: " + comEmp.getSocialSecurityNumber());
        System.out.println("Gross Sales: €" + df.format(comEmp.getGrossSales()));
        System.out.println("Earnings: €" + df.format(comEmp.calcCommission()));


        System.out.println("\n[Commission Employee PLUS 1]");
        System.out.println("SSN: " + comEmpPlus.getSocialSecurityNumber());
        System.out.println("Gross Sales: €" + df.format(comEmpPlus.getGrossSales()));
        comEmpPlus.calcEarnings();
        System.out.println("Earnings: €" + df.format(comEmpPlus.getEarnings()));
    }// Main
}// Class - TestEmployee
