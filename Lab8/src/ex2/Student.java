package ex2;

/**
 * Created by: Ken
 * Created on: 18/02/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Student {
    private String studentID;
    private String name;
    private String subject;
    private int resultCA1;
    private int resultCA2;

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }// Setter - studentID

    public void setName(String name) {
        this.name = name;
    }// Setter - name

    public void setSubject(String subject) {
        this.subject = subject;
    }// Setter - subject

    public void setResultCA1(int resultCA1) {
        this.resultCA1 = resultCA1;
    }// Setter - resultCA1

    public void setResultCA2(int resultCA2) {
        this.resultCA2 = resultCA2;
    }// Setter - resultCA2

    public String getName() {
        return name;
    }// Getter - name

    public int getResultCA1() {
        return resultCA1;
    }// Getter - resultCA1

    public int getResultCA2() {
        return resultCA2;
    }// Getter - resultCA2

    public void print() {
        System.out.printf("%15s%-15s\n", "Student ID: ", studentID);
        System.out.printf("%15s%-15s\n", "Student Name: ", name);
        System.out.printf("%15s%-15s\n", "Subject: ", subject);
        System.out.printf("%15s%-15d\n", "CA1 Result: ", getResultCA1());
        System.out.printf("%15s%-15d\n", "CA2 Result: ", getResultCA2());
    }// Method - print
}// Class - Student
