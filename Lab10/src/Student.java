import java.util.Arrays;

public class Student {
    private String name;
    private int studentNumber;
    private double[] results;
    private String[] grades;
    private double[] gpas;
    private double gpa;

    public Student(String name, int studentNumber, int numExamsPassed) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.results = new double[numExamsPassed];
        this.grades = new String[numExamsPassed];
        this.gpas = new double[numExamsPassed];
    }// Constructor - Student

    public void setResult(int examNum, double resultValue) {
        if (resultValue > 0 && resultValue <= 100) {
            results[examNum] = resultValue;
        } else {
            results[examNum] = 0;
        }// if-else
    }// Method setResult

    public void processResults() {
        for (int i = 0; i < results.length; i++) {
            if (results[i] < 35) {
                grades[i] = "F";
                gpas[i] = 0;
            } else if (results[i] < 40) {
                grades[i] = "D";
                gpas[i] = 1.5;
            } else if (results[i] < 50) {
                grades[i] = "C";
                gpas[i] = 2.0;
            } else if (results[i] < 55) {
                grades[i] = "C+";
                gpas[i] = 2.5;
            } else if (results[i] < 60) {
                grades[i] = "B-";
                gpas[i] = 2.75;
            } else if (results[i] < 70) {
                grades[i] = "B";
                gpas[i] = 3.0;
            } else if (results[i] < 80) {
                grades[i] = "B+";
                gpas[i] = 3.5;
            } else {
                grades[i] = "A";
                gpas[i] = 4.0;
            }// if-else
        }// for loop
    }// Method - processResults

    public double calcGPA() {
        double sumGPAs = Arrays.stream(gpas).sum();
        gpa = sumGPAs / gpas.length;

        return gpa;
    }// Method - calcGPA

    public void calcRepeatFee() {
        final double FEE = 50.0;
        double repeatFee;
        int numOfFails = 0;


        for (String grade: grades) {
            if (grade.equals("F")) {
                numOfFails++;
            }// if statement
        }// for loop

        // Calculate fee
        repeatFee = numOfFails * FEE;

        if (numOfFails > 0) {
            System.out.println("Total Repeat Fee: €" + repeatFee);
        } else {
            System.out.println("No repeat fee due. Well Done!");
        }// if-else
    }// Method - calcRepeatFee

    public void print() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Number: " + studentNumber);
        System.out.printf("%-10s%-10s%-10s\n", "Result", "Grade", "GPA");
        for (int result = 0; result < results.length; result++) {
            System.out.printf("%-10s%-10s%-10s\n", results[result], grades[result], gpas[result]);
        }// for loop
    }// Method - print
}// Class - Student
