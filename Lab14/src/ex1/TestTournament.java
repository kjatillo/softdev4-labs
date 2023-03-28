package ex1;

import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 10/03/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class TestTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tournamentName;
        int numPlayers;

        System.out.print("Enter name of tournament: ");
        tournamentName = scanner.nextLine();

        System.out.print("Enter number of players: ");
        numPlayers = scanner.nextInt();
        scanner.nextLine();

        DartsTournament dt1 = new DartsTournament(tournamentName, numPlayers);

        for (int player = 0; player < numPlayers; player++) {
            System.out.printf("Please enter name of player %d: ", (player + 1));
            String playerName = scanner.nextLine();
            dt1.fillNamesTable(player, playerName);

            System.out.printf("Please enter how many darts games %s has played: ", playerName);
            int numGamesPlayed = scanner.nextInt();

            System.out.printf("Please enter how many games %s has won: ", playerName);
            int numGamesWon = scanner.nextInt();

            System.out.printf("Please enter how many games %s has drawn: ", playerName);
            int numGamesDrawn = scanner.nextInt();

            System.out.printf("Please enter how many games %s has lost", playerName);
            int numGamesLost = scanner.nextInt();

            System.out.printf("Please enter how many legs %s has won: ", playerName);
            int numLegsWon = scanner.nextInt();

            System.out.printf("Please enter how many legs %s has lost: ", playerName);
            int numLegsLost = scanner.nextInt();

            int difference = numLegsWon - numGamesLost;
            int points = (numGamesWon * 3) + numGamesDrawn;

            int[][] results = {numGamesPlayed, numGamesWon, numGamesDrawn, numGamesLost, numLegsWon, numLegsLost, difference, points};
    }// Main
}// Class - TestTournament
