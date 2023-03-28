package ex3_1;

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

    public void withdraw(double amt) {
        if (amt < 0) {
            try {
                throw new PositiveWithdrawalException();
            } catch (PositiveWithdrawalException err) {
                System.out.println(err.getMessage());
            }// try-catch
        }// if

        balance -= amt;
    }// Method - withdraw

    public double getBalance() {
        return balance;
    }// Getter - getBalance
}// Class - Account
