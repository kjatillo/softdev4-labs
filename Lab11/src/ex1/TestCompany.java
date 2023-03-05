package ex1;

/**
 * Created by: Ken
 * Created on: 05/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class TestCompany {
    public static void main(String[] args) {
        StaffMember[] memberList = new StaffMember[8];

        memberList[0] = new Executive("John", "1 This St.", "0874323476", "R65746365", 2423.07);
        memberList[1] = new Employee("Paul", "2 That St.", "0854345222", "P8884635", 1246.15);
        memberList[2] = new Employee("Dave", "3 Other St.", "0864343566", "S9876635", 1169.23);
        memberList[3] = new Hourly("Joanne", "4 Long Ave.", "0836789676", "T0987635", 10.55);
        memberList[4] = new Volunteer("Norma", "5 Short Ave. ", "0864323456");
        memberList[5] = new Volunteer("Kate", "6 Pecks Lane", "0854676767");
        memberList[6] = new Commission("Molly", "7 Nowhere Rd.", "0864326789", "L6599635", 6.25, .2);
        memberList[7] = new Commission("Joe", "8 My Place", "0864344545", "G8888635", 9.75, .15);

        Staff company = new Staff(memberList);
        company.processStaff();
        company.payday();
    }// Main
}// Class - Company
