/**
 * Created by: Ken
 * Created on: 01/04/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class DartsTournament extends Tournament {
    private String[] playerNames;
    private int[][] leagueTableStatistics;

    public DartsTournament(int numPlayers, String tournamentName) {
        super(numPlayers, tournamentName);
        playerNames = new String[numPlayers];
        leagueTableStatistics = new int[numPlayers][8];
    }// Constructor - DartsTournament


    public void fillNamesTable(int index, String playerName) {
        playerNames[index] = playerName;
    }// Method - fillNamesTable

    public void fillTable(int[][] statisticsTable) {
        leagueTableStatistics = statisticsTable;
    }// Method - fillTable

    @Override
    public int processResult() {
        int sum = 0;

        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n",
                "Player", "Played", "Won", "Drawn", "Lost", "Legs Won", "Legs Lost", "Diff", "Points");
        for (int i = 0; i < leagueTableStatistics.length; i++) {
            System.out.printf("%-10s", playerNames[i]);
            for(int j = 0; j < leagueTableStatistics[i].length; j++) {
                if (j == 4){
                    sum += leagueTableStatistics[i][j];
                }// if
                System.out.printf("%-10d", leagueTableStatistics[i][j]);
            }// inner for
            System.out.println();
        }// outer for

        return sum;
    }// Method - processResult

    public void calculateAverage(int sumLegsWon) {
        double average = (double) sumLegsWon / (double) playerNames.length;
        int greaterThanAverage = 0;

        System.out.printf("Average number of legs per player: %.1f\n", average);
        for (int[] row: leagueTableStatistics){
            if (row[4] > average) {
                greaterThanAverage++;
            }// if
        }// for
        System.out.printf("Number of players whose total legs won exceeded the average: %d\n", greaterThanAverage);
    }// Method - calculateAverage

    public void calcWinnerLegDiff() {
        int highestGoal = leagueTableStatistics[0][7];
        int highestTeamIndex = 0;
        String winner = "";

        for (int i = 0; i < playerNames.length; i++) {
            if (leagueTableStatistics[i][7] > highestGoal) {
                highestGoal = leagueTableStatistics[i][7];
                highestTeamIndex = i;
            } else if (i != highestTeamIndex && leagueTableStatistics[i][7] == highestGoal) {
                if (leagueTableStatistics[highestTeamIndex][6] > leagueTableStatistics[i][6]) {
                    winner = playerNames[highestTeamIndex];
                } else {
                    winner = playerNames[i];
                }// inner if-else
            }// outer if-else
        }// for
        System.out.printf("Winner is %s based on leg diff\n", winner);
    }// Method - calculateAverage
}// Class - DartsTournament
