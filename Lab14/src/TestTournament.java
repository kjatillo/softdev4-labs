import java.util.Scanner;

/**
 * Created by: Ken
 * Created on: 01/04/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class TestTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tournamentName;
        int numPlayers;
        String teamName;
        int[][] leagueStatistics;

        DartsTournament dartsCompetition;

        System.out.print("Please enter the name of the tournament: ");
        tournamentName = scanner.nextLine();
        System.out.print("Please enter the number of players you want to process: ");
        numPlayers = scanner.nextInt();
        scanner.nextLine();
        leagueStatistics = new int[numPlayers][8];

        dartsCompetition = new DartsTournament(numPlayers, tournamentName);

        for (int num = 0; num < numPlayers; num++) {
            System.out.print("\nPlease enter player " + (num + 1) + "'s name here: ");
            String playerName = scanner.nextLine();

            dartsCompetition.fillNamesTable(num, playerName);
            System.out.print("Please enter how many darts games " + playerName + " has played: ");
            int gamesPlayed = scanner.nextInt();

            System.out.print("Please enter how many games " + playerName + " has won: ");
            int gamesWon = scanner.nextInt();

            System.out.print("Please enter how many games " + playerName + " has drawn: ");
            int gamesDrawn = scanner.nextInt();

            System.out.print("Please enter how many games " + playerName + " has lost: ");
            int gamesLost = scanner.nextInt();

            System.out.print("Please enter how many legs " + playerName + " has won: ");
            int legsWon = scanner.nextInt();

            System.out.print("Please enter how many legs " + playerName + " has lost: ");
            int legsLost = scanner.nextInt();

            int legDiff = legsWon - legsLost;
            int points = (gamesWon * 3) + (gamesDrawn);

            int[] playerStat = {gamesPlayed, gamesWon, gamesDrawn, gamesLost, legsWon, legsLost, legDiff, points};
            leagueStatistics[num] = playerStat;
            scanner.nextLine();
        }// for

        System.out.println();
        dartsCompetition.fillTable(leagueStatistics);
        int sum = dartsCompetition.processResult();
        System.out.println();
        dartsCompetition.calculateAverage(sum);
        dartsCompetition.calcWinnerLegDiff();
    }// Main
}// Method - TestTournament
