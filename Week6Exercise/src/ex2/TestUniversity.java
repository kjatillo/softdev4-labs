package ex2;

/**
 * Created by: Ken
 * Created on: 05/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class TestUniversity {
    public static void main(String[] args) {

        int[] departmentIDs = {1001, 1002, 1003, 1004};
        String[] departmentNames = {"Computing", "Business", "Languages", "Engineering"};

        University newUniv = new University("DCU", departmentIDs, departmentNames);
        newUniv.showList();
        System.out.println();
        newUniv.changeDepartmentName("Business", "Business & Marketing");
        newUniv.showList();
    }// Main
}// Class - TestUniversity
