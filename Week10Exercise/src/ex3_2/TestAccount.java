package ex3_2;

/**
 * Created by: Ken
 * Created on: 28/03/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class TestAccount {
    public static void main(String[] arg) {
        Account theAccount = new Account(200);

        try {
            theAccount.withdraw(-300);
        } catch (PositiveWithdrawalException err) {
            System.out.println(err.getMessage());
        }// try-catch
    }// Main
}// Class - TestAccount
