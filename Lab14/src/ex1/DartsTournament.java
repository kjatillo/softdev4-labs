package ex1;

/**
 * Created by: Ken
 * Created on: 10/03/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class DartsTournament extends Tournament {
    private String[] playerNames;
    private int[][] leagueTableStatistics;

    public DartsTournament(String tournamentName, int numPlayers) {
        super(tournamentName, numPlayers);
        playerNames = new String[numPlayers];
        leagueTableStatistics = new int[numPlayers][8];
    }// Constructor - DartsTournament

    public void fillNamesTable(int indexNum, String playerName) {
        playerNames[indexNum] = playerName;
    }// Method - fillNamesTable

    public void fillTable(int[][] leagueTableStatistics) {
        this.leagueTableStatistics = leagueTableStatistics;
    }// Method - fillTable

    @Override
    public int processResults() {
        int sum = 0;

        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n","Player","Played","Won","Drawn"," Lost","Legs Won","Legs Lost","Diff","Points");

        for (int row = 0; row < leagueTableStatistics.length; row++) {
            System.out.printf("%-10s", playerNames[row]);
            for (int col = 0; col < leagueTableStatistics[row].length; col++) {
                if (col == 4) {
                    sum +=leagueTableStatistics[row][col];
                }// if
                System.out.printf("%-10d", leagueTableStatistics[row][col]);
            }// inner for
            System.out.println();
        }// outer for
        return sum;
    }// Method - processResults

    public void calculateAverage(int sumLegsWon) {
        double average = (double) sumLegsWon / (double) playerNames.length;

        System.out.printf("Average number of legs won: %.2f\n", average);
        int aboveAverageCount = 0;
        for (int[] row: leagueTableStatistics) {
            if (row[4] > average)
                aboveAverageCount++;
        }// for

        System.out.println("Number of players where legs won exceeded average: " + aboveAverageCount);
    }// Method - calculateAverage

    public void calcWinnerLegDiff() {
        String winner = null;
        int highestGoal = Integer.MIN_VALUE;
        int highestGoalIndex = -1;
        for (int i = 0; i < playerNames.length; i++) {
            if (leagueTableStatistics[i][7] > highestGoal) {
                highestGoal = leagueTableStatistics[i][7];
                highestGoalIndex = i;
            } else if (i != highestGoalIndex && leagueTableStatistics[i][7] == highestGoal) {
                if (leagueTableStatistics[i][6] > leagueTableStatistics[highestGoalIndex][6]) {
                    winner = playerNames[i];
                } else {
                    winner = playerNames[highestGoalIndex];
                }// inner if-else
            }// outer if-else
        }// for
        System.out.println("Winner based on leg difference: " + winner);
    }// Method - calcWinnerLegDiff
}// Class - DartsTournament
