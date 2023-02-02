package ex2;

/**
 * Created by: Ken
 * Created on: 27/01/2023
 */

public class Ex2 {
    public static void main(String[] args) {
        // Variable declaration & initiation
        int popDublin = 544017;
        int popMeath = 195044;
        int popLeitrim = 32044;

        // Calculation
        popDublin += popLeitrim;
        popLeitrim = 0;

        // Output
        System.out.println("Population Meath: " + popMeath);
        System.out.println("Population Leitrim: " + popLeitrim);
        System.out.println("Population Dublin: " + popDublin);
    }// Main
}// Class - Ex2
