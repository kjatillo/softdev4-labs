package ex1;

import java.text.DecimalFormat;

/**
 * Created by: Ken
 * Created on: 05/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Staff {
    private StaffMember[] staffList;
    DecimalFormat df = new DecimalFormat("#,##0.00");

    public Staff(StaffMember[] staffList) {
        this.staffList = staffList;
    }// Constructor - Staff

    public void processStaff() {
        for (StaffMember staffMember : staffList) {
            if (staffMember instanceof Executive) {
                Executive executiveMember = (Executive) staffMember;
                executiveMember.awardBonus(500);
            } else if (staffMember instanceof Commission) {
                Commission commissionMember = (Commission) staffMember;

                if (commissionMember.name.equals("Molly")) {
                    commissionMember.addHours(55);
                    commissionMember.addSales(400);
                } else if (commissionMember.name.equals("Joe")) {
                    commissionMember.addHours(45);
                    commissionMember.addSales(950);
                }// if-else
            } else if (staffMember instanceof Hourly) {
                Hourly hourlyMember = (Hourly) staffMember;

                if (hourlyMember.name.equals("Joanne")) {
                    hourlyMember.addHours(50);
                }// if
            }// if-else
        }// for
    }// Method - processStaff

    public void payday() {
        for (StaffMember staffMember : staffList) {
            System.out.println(staffMember.toString());
            if (staffMember.pay() == 0) {
                System.out.println("Thanks!");
            } else {
                System.out.printf("Paid: €%s\n", df.format(staffMember.pay()));
            }// if-else
            System.out.println("-----------------------------------");
        }// for
    }// Method - payday
}// Class - Staff
