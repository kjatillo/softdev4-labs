package ex1;

/**
 * Created by: Ken
 * Created on: 10/03/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public abstract class Tournament {
    private int numPlayers;
    private String tournamentName;

    public Tournament(String tournamentName, int numPlayers) {
        this.tournamentName = tournamentName;
        this.numPlayers = numPlayers;
    }// Constructor - Tournament

    public abstract int processResults();  // Abstract method - processResults
}// Class - Tournament
