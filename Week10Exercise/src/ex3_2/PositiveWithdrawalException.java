package ex3_2;

/**
 * Created by: Ken
 * Created on: 28/03/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class PositiveWithdrawalException extends Exception {
    public PositiveWithdrawalException() {
        super("Withdrawal amount must be positive!");
    }// Constructor - PositiveWithdrawalException
}// Class - PositiveWithdrawalException
