package ex2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 10/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Ex2 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // Variable
        final int NUM_CANDIDATES = 5;
        int numVotes;
        String candidateName;
        // Array
        String[] candidateArray = new String[NUM_CANDIDATES];
        int[] voteArray = new int[NUM_CANDIDATES];
        double[] votePercentage = new double[NUM_CANDIDATES];

        // User input
        for (int i = 0; i < NUM_CANDIDATES; i++) {
            System.out.printf("Enter candidate %d name: ", i + 1);
            candidateName = input.nextLine();
            candidateArray[i] = candidateName;  // Appending candidate name to list

            System.out.printf("Enter candidate %d votes: ", i + 1);
            numVotes = input.nextInt();
            voteArray[i] = numVotes;  // Appending candidate votes to list
            input.nextLine();
            System.out.println();
        }// for loop

        // Calculating percentage of each vote
        int totalVotes = Arrays.stream(voteArray).sum();

        for (int i = 0; i < NUM_CANDIDATES; i++) {
            double percentage = (voteArray[i] / (double) totalVotes) * 100;
            votePercentage[i] = percentage;
        }// for loop

        // Output
        System.out.printf("%-15s%-15s%-15s", "Candidate", "Votes", "% of Total Votes\n");
        for (int i = 0; i < NUM_CANDIDATES; i++) {
            System.out.printf("%-15s%-15d%-15.2f\n", candidateArray[i], voteArray[i], votePercentage[i]);
        }// for loop

        // Calculating max vote and getting index
        int maxVote = 0;
        int voteIndex = -1;
        for (int i = 0; i < NUM_CANDIDATES; i++) {
            if (voteArray[i] > maxVote) {
                maxVote = voteArray[i];
                voteIndex = i;
            }// if-statement
        }// for loop

        System.out.println("\nTotal Votes: " + totalVotes);
        System.out.println("Winner: " + candidateArray[voteIndex]);
    }// Main
}// Class - Ex2
