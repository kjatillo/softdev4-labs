import java.text.DecimalFormat;

/**
 * Created by: Ken
 * Created on: 28/04/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Account implements ITax, Comparable<Account> {
    private int accountNum;
    private String accountType;
    private String firstName;
    private String lastName;
    private double balance;
    private int pin;

    public Account(int accountNum, String accountType, String firstName, String lastName, double balance, int pin) {
        this.accountNum = accountNum;
        this.accountType = accountType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.pin = pin;
    }// Constructor - Account

    public int getAccountNum() {
        return accountNum;
    }// Getter - getAccountNum

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }// Setter - setAccountNum

    public String getAccountType() {
        return accountType;
    }// Getter - getAccountType

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }// Setter - setAccountType

    public String getFirstName() {
        return firstName;
    }// Getter - getFirstName

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }// Setter - setFirstName

    public String getLastName() {
        return lastName;
    }// Getter - getLastName

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }// Setter - setLastName

    public double getBalance() {
        return balance;
    }// Getter - getBalance

    public void setBalance(double balance) {
        this.balance = balance;
    }// Setter - setBalance

    public int getPin() {
        return pin;
    }// Getter - getBalance

    public void setPin(int pin) {
        this.pin = pin;
    }// Setter - setBalance

    public void calcTax() {
        if ((getBalance() > LOW_RANGE) && (getBalance() <= MID_RANGE)) {
            balance = balance - (balance * LOW_TAX_RATE);
        } else if ((getBalance() > MID_RANGE) && (getBalance() <= HIGH_RANGE)) {
            balance = balance - (balance * MID_TAX_RATE);
        } else {
            balance = balance - (balance * HIGH_TAX_RATE);
        }
    }// Method - calcTax

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return String.format("%-15d%-15s%-15s%-15s%-15s%-15d",
                accountNum, accountType, firstName, lastName, "€" + df.format(balance), pin);
    }// Method - toString

    @Override
    public int compareTo(Account other) {
        return (int) (this.getBalance() - other.getBalance());
    }// Method - compareTo
}// Class - Account
