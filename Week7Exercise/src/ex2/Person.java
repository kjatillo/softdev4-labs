package ex2;

/**
 * Created by: Ken
 * Created on: 07/03/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }// Constructor - Person

    public String getName() {
        return name;
    }// Getter - Person

    public String toString() {
        return String.format("%15s", name);
    }// Method - toString
}// Class - Person
