/**
 * Created by: Ken
 * Created on: 01/04/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public abstract class Tournament {
    private int numPlayers;
    private String tournamentName;

    public Tournament(int numPlayers, String tournamentName) {
        this.numPlayers = numPlayers;
        this.tournamentName = tournamentName;
    }// Constructor - Tournament

    public abstract int processResult();  // Abstract method - processResult
}// Class - Tournament
