package darts;

import java.util.Scanner;

public class TestTournament1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int nr;
        String teamName;
        int[][] league_stats;

        DartsTournament dartsCompetition;

        System.out.println("Please enter the name of the tournament");
        name = in.nextLine();
        System.out.println("Please enter the number of players you want to process:");
        nr = in.nextInt();
        in.nextLine();
        league_stats = new int[nr][8];

        dartsCompetition = new DartsTournament(name, nr);

        for (int num = 0; num < nr; num++) {
            System.out.println("Please enter player " + (num+1) + "'s name here: ");
            String playerName = in.nextLine();

            dartsCompetition.fillNamesTable(num, playerName);
            System.out.println("Please enter how many darts games " + playerName + " has played: ");
            int gamesPlayed = in.nextInt();

            System.out.println("Please enter how many games " + playerName + " has won: ");
            int gamesWon = in.nextInt();

            System.out.println("Please enter how many games " + playerName + " has drawn: ");
            int gamesDrawn = in.nextInt();

            System.out.println("Please enter how many games " + playerName + " has lost: ");
            int gamesLost = in.nextInt();

            System.out.println("Please enter how many legs " + playerName + " has won: ");
            int legsWon = in.nextInt();

            System.out.println("Please enter how many legs " + playerName + " has lost: ");
            int legsLost = in.nextInt();

            int legDiff = legsWon - legsLost;
            int points = (gamesWon * 3) + (gamesDrawn);

            int[] playerStat = {gamesPlayed, gamesWon, gamesDrawn, gamesLost, legsWon, legsLost, legDiff, points};
            league_stats[num] = playerStat;
            in.nextLine();
        }
        dartsCompetition.fillTable(league_stats);
        int sum = dartsCompetition.processTable();
        dartsCompetition.calculateAverage(sum);
        dartsCompetition.calcLegDiff();
    }
}
