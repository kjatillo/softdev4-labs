package ex2;

/**
 * Created by: Ken
 * Created on: 18/02/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class PrintCard {
    private String accountNumber;
    private String password;
    private int numberOfCredits;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }// Setter - accountNumber

    public void setPassword(String password) {
        this.password = password;
    }// Setter - password

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }// Setter - numberCredits

    public int getNumberOfCredits() {
        return numberOfCredits;
    }// Getter = numberOfCredits

    public void print() {
        System.out.printf("%15s%-15s\n", "Account #: ", accountNumber);
        System.out.printf("%15s%-15s\n", "Password: ", password);
        System.out.printf("%15s%-15s\n", "Credits: ", numberOfCredits);
    }// Method - print
}// Class - PrintCard
