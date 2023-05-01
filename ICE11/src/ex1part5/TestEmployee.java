package ex1part5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by: Ken
 * Created on: 01/05/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class TestEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> persons = new ArrayList<>();

        persons.add(new Employee("Donnell", "John", 34));
        persons.add(new Employee("Collins", "Tony", 18));
        persons.add(new Employee("Greally", "Jim ", 16));
        persons.add(new Employee("Brady", "Noel", 69));

        Collections.sort(persons, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getLastName().compareTo(emp2.getLastName());
            }// Method - compare
        });

        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }// Method - main
}// Class - TestEmployee
