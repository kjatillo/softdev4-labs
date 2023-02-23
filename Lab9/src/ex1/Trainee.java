package ex1;

import ex1.Employee;

/**
 * Created by: Ken
 * Created on: 23/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Trainee extends Employee {
    private final double hourlyTraineeRate = 5.0;
    private final int hoursTraining;

    public Trainee(String name, int employeeNum, int hoursWorkedWeekly, double wagePerHour, int hoursTraining) {
        super(name, employeeNum, hoursWorkedWeekly, wagePerHour);
        this.hoursTraining = hoursTraining;
    }// Constructor - Trainee

    public double calculateSalary() {
        double trainingPay = hourlyTraineeRate * hoursTraining;

        return super.calculateSalary() + trainingPay;
    }// Method - calculateSalary

    public void print() {
        super.print();
        System.out.println("Training Hours (Week): " + hoursTraining);
        System.out.println("Trainee Hourly Rate: " + hourlyTraineeRate);
    }// Method - print
}// Class - Trainee
