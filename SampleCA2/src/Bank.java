import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by: Ken
 * Created on: 28/04/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Bank {
    private String name;
    private ArrayList<Account> accountList;

    public Bank() {
        this.name = "Banking4All";
        accountList = new ArrayList<>();
    }// Constructor - Bank

    public void addAccount(int accountNum, String accountType, String firstName, String lastName, double balance, int pin) {
        Account account = new Account(accountNum, accountType, firstName, lastName, balance, pin);
        accountList.add(account);
    }// Method - addAccount

    public void showAccounts() {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n",
                "Account #", "Account Type", "First Name", "Last Name", "Balance", "Pin");;
        for (Account account : accountList) {
            if (account.getBalance() < 0) {
                try {
                    throw new NegativeBalanceException();
                } catch (NegativeBalanceException err) {
                    System.out.println(err.getMessage());
                }// try-catch
            }// if
            System.out.println(account);
        }// for
    }// Method - showAccounts

    public int findAccount(int accountNum) {
        int index = -1;
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getAccountNum() == accountNum) {
                index = i;
            }// if
        }// for
        return index;
    }// Method - findAccount

    public void changePin(int accountNum, int newPin) {
        int index = findAccount(accountNum);
        accountList.get(index).setPin(newPin);
    }// Method - changePin

    public double calcTotalSavings() {
        String SAVINGS_ACCOUNT = "SA";
        double total = 0;

        for (Account account : accountList) {
            if (account.getAccountType().equals(SAVINGS_ACCOUNT)) {
                total += account.getBalance();
            }// if
        }// for

        return total;
    }// Method - calcTotalSavings

    public void applyTax() {
        String CURRENT_ACCOUNT = "CA";
        double TAX_RATE = 0.05;

        for (Account account : accountList) {
            if (account.getAccountType().equals(CURRENT_ACCOUNT) && account.getBalance() > 0) {
                account.calcTax();
            }// if
        }// for
    }// Method - applyTax

    public void sortAccounts1() {
        accountList.sort(new NameComparator());
    }// Method - sortAccounts1

    public void sortAccounts2() {
        Collections.sort(accountList);
    }// Method - sortAccounts2
}// Class - Bank
