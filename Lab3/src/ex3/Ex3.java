package ex3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 02/02/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Ex3 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Decimal format
        DecimalFormat df = new DecimalFormat("#,##0.00");
        // Variable declaration
        int centsPurchasePrice;
        int centsTenderedAmount;
        double purchasePrice;
        double amountTendered;
        double change;

        // User input
        System.out.print("Enter purchase price in cents: ");
        centsPurchasePrice = input.nextInt();

        System.out.print("Enter amount tendered: ");
        centsTenderedAmount = input.nextInt();

        // Calculation
        purchasePrice = centsPurchasePrice / 100.0;
        amountTendered = centsTenderedAmount / 100.0;
        change = (centsTenderedAmount - centsPurchasePrice) / 100.0;

        int temp = (int) (change * 100);
        int euroCoins = temp / 100;
        temp = temp % 100;
        int fiftyCentPieces = temp / 50;
        temp = temp % 50;
        int twentyCentPieces = temp / 20;
        temp = temp % 20;
        int tenCentPieces = temp / 10;
        temp = temp % 10;
        int fiveCentPieces = temp / 5;
        temp = temp % 5;
        int oneCentPieces = temp;

        // Output
        if (centsPurchasePrice > centsTenderedAmount) {
            System.out.println("Not enough change was tendered!");
        } else {
            System.out.println("\nPurchase price: €" + df.format(purchasePrice));
            System.out.println("Amount tendered: €" + df.format(amountTendered));
            System.out.println("Change: €" + df.format(change));
            System.out.println("\nChange in euro coins: " + euroCoins);
            System.out.println("Change in 50 cent pieces: " + fiftyCentPieces);
            System.out.println("Change in 20 cent pieces: " + twentyCentPieces);
            System.out.println("Change in 10 cent pieces: " + tenCentPieces);
            System.out.println("Change in 5 cent pieces: " + fiveCentPieces);
            System.out.println("Change in 1 cent pieces: " + oneCentPieces);
        }// if-else
    }// Main
}// Class - Ex3
