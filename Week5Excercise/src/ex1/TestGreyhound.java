package ex1;

/**
 * Created by: Ken
 * Created on: 21/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class TestGreyhound {
    public static void main(String[] args) {
        Greyhound g1 = new Greyhound(
                1234, "Mr. Flash", 3, "Tom Foley", "The Late Late Show", 5);
        Greyhound g2 = new Greyhound(5678, "Mr. Jones", 7, "Isus", "Icarus", 5);

        g1.updateWinningRecord(1, true);
        g1.updateWinningRecord(2, true);
        g1.updateWinningRecord(3, false);
        g1.updateWinningRecord(4, false);
        g1.updateWinningRecord(5, false);
        g1.displayDetails();

        System.out.println();
        g2.updateWinningRecord(1, false);
        g2.updateWinningRecord(2, false);
        g2.updateWinningRecord(3, false);
        g2.updateWinningRecord(4, false);
        g2.updateWinningRecord(5, false);
        g2.displayDetails();

        System.out.println();
        winner(g1, g2);
    }// Main

    public static void winner(Greyhound gh1, Greyhound gh2) {
        if (gh1.getNumRacesWon() > gh2.getNumRacesWon()) {
            System.out.println(gh1.getName() + " has won the most races with " + gh1.getNumRacesWon());
        } else if (gh1.getNumRacesWon() < gh2.getNumRacesWon()) {
            System.out.println(gh2.getName() + " has won the most races with " + gh2.getNumRacesWon());
        } else {
            System.out.println("Both has won an equal amount of races with " + gh1.getNumRacesWon());
        }// if-else
    }// Method - winner
}// Class - TestGreyhound
