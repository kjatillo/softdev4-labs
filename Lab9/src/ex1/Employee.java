package ex1;

/**
 * Created by: Ken
 * Created on: 23/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Employee {
    private final String name;
    private final int employeeNum;
    private final double wagePerHour;
    private final int hoursWorkedWeekly;
    protected double weeklySalary;

    public Employee(String name, int employeeNum, int hoursWorkedWeekly, double wagePerHour) {
        this.name = name;
        this.employeeNum = employeeNum;
        this.wagePerHour = wagePerHour;
        this.hoursWorkedWeekly = hoursWorkedWeekly;
    }// Constructor - Employee

    public int getHoursWorked() {
        return hoursWorkedWeekly;
    }// Getter - hoursWorkedWeekly

    public double getWagesRate() {
        return wagePerHour;
    }// Getter - getWagesRate

    public double calculateSalary() {
        return hoursWorkedWeekly * wagePerHour;
    }// Method - calculateSalary

    public void print() {
        System.out.println("[Employee Details]");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Number: " + employeeNum);
        System.out.println("Wages Per Hour: " + getWagesRate());
        System.out.println("Hours Worked (Week): " + getHoursWorked());
        System.out.println("Weekly Salary: " + calculateSalary());
    }// Method - print
}// Class - Employee
