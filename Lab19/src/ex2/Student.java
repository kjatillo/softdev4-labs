package ex2;

/**
 * Created by: Ken
 * Created on: 01/05/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Student {
    private String name;
    private String number;
    private double result1, result2;
    private double average;

    public Student(String name, String number, double result1,double result2) {
        this.name = name;
        this.number = number;
        this.result1 = result1;
        this.result2 = result2;
        calcAverage();
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    public void setName(String name) {
        this.name = name;
    }


    private void calcAverage() {
        double total = 0;

        total = result1 + result2;

        setAverage(total / 2);
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student:" + "name=" + name + ", number=" + number +", average=" + average;
    }

    public String getNumber() {
        return number;
    }
}// Class - Student
