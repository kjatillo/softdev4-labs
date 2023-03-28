package ex3_2;

/**
 * Created by: Ken
 * Created on: 28/03/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Account {
    // Class variable
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }// Constructor - Account

    public void withdraw(double amt) throws PositiveWithdrawalException {
        if (amt < 0) {
            throw new PositiveWithdrawalException();
        }// if

        balance -= amt;
    }// Method - withdraw

    public double getBalance() {
        return balance;
    }// Getter - getBalance
}// Class - Account
