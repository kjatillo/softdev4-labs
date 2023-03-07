package ex2;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 07/03/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class TestBand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"John", "Paul", "George", "Ringo"};
        String[] instruments = {"Keyboards", "Guitar", "Guitar", "Drums"};
        RockBand rb = new RockBand("The Beatles", "Apple", names, instruments);

        System.out.println(rb);

        System.out.println("[Enter New Label]");
        String newLabel = scanner.nextLine();
        if (rb.changeRecordCompany(newLabel)) {
            System.out.println("Label changed!");
        } else {
            System.out.println("Label was NOT changed!");
        }// if-else

    }// Main
}// Class - TestBand
