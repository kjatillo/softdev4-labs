package darts;

import java.util.Scanner;

public class TestTournament2 {
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
            league_stats[num][0]=in.nextInt();

            System.out.println("Please enter how many games " + playerName + " has won: ");
            league_stats[num][1]=in.nextInt();

            System.out.println("Please enter how many games " + playerName + " has drawn: ");
            league_stats[num][2]=in.nextInt();

            System.out.println("Please enter how many games " + playerName + " has lost: ");
            league_stats[num][3]=in.nextInt();

            System.out.println("Please enter how many legs " + playerName + " has won: ");
            league_stats[num][4]=in.nextInt();

            System.out.println("Please enter how many legs " + playerName + " has lost: ");
            league_stats[num][5]=in.nextInt();

            in.nextLine();
            league_stats[num][6] = league_stats[num][4] - league_stats[num][5];
            league_stats[num][7] = (league_stats[num][1] * 3) + (league_stats[num][2]);
        }
        dartsCompetition.fillTable(league_stats);
        int sum = dartsCompetition.processTable();
        dartsCompetition.calculateAverage(sum);
        dartsCompetition.calcLegDiff();
    }
}

