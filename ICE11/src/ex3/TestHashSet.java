package ex3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by: Ken
 * Created on: 01/05/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class TestHashSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPairs;

        System.out.print("Number of pairs: ");
        numPairs = scanner.nextInt();

        String[] pairLeft = new String[numPairs];
        String[] pairRight = new String[numPairs];

        for (int i = 0; i < numPairs; i++) {
            System.out.print("Enter pair number " + (i + 1) + ": ");
            pairLeft[i] = scanner.next();
            pairRight[i] = scanner.next();
        }// for

        Set<String> uniquePairsSet = new HashSet<>(numPairs);

        // then, adds the numbers
        for (int i = 0; i < numPairs; i++) {
            uniquePairsSet.add(pairLeft[i] + " " + pairRight[i]);
            System.out.println("Unique pairs: " + uniquePairsSet.size());
        }// for
    }// Method - main
}// Class - TestHashSet
