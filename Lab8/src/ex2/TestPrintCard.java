package ex2;

/**
 * Created by: Ken
 * Created on: 18/02/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class TestPrintCard {
    public static void main(String[] args) {
        PrintCard testcard1 = new PrintCard();
        testcard1.setAccountNumber("12345");
        testcard1.setPassword("password");
        testcard1.setNumberOfCredits(1000);

        testcard1.print();
    }// Main
}// Class - TestPrintCard
