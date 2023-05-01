package ex1part5;

/**
 * Created by: Ken
 * Created on: 01/05/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Employee {
    private String firstName;
    private String lastName;
    private int age;

    public Employee() {
        firstName = "";
        lastName = "";
        age = 0;
    }

    public Employee(String l, String f, int a) {
        firstName = f;
        lastName = l;
        age = a;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName + "\t" + "Last Name: "
                + lastName + "\t" + "Age:" + age;
    }
}// Class - Employee
