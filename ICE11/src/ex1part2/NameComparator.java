package ex1part2;

import java.util.Comparator;

/**
 * Created by: Ken
 * Created on: 01/05/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getLastName().compareTo(emp2.getLastName());
    }// Method - compare
}// Class - NameComparator
