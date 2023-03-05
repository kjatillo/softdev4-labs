package ex1;

/**
 * Created by: Ken
 * Created on: 21/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Greyhound extends Animal {
    private final String name;
    private final int age;
    private final String fatherName;
    private final String motherName;
    private final int numRacesRan;
    private int numRacesWon;
    private final boolean[] raceResults;

    public Greyhound(int id, String name, int age, String father, String mother, int numRacesRan) {
        super(id, "Greyhound");
        this.name = name;
        this.age = age;
        this.fatherName = father;
        this.motherName = mother;
        this.numRacesRan = numRacesRan;
        this.numRacesWon = 0;
        raceResults = new boolean[numRacesRan];
    }// Constructor - Greyhound

    public void updateWinningRecord(int raceNum, boolean result) {
        raceResults[raceNum - 1] = result;

        if (result)
            numRacesWon++;
    }// Method - updateWinningRecord

    public String getName() {
        return name;
    }// Getter - name

    public int getNumRacesWon() {
        return numRacesWon;
    }// Getter - numRacesWon

    public void displayDetails() {
        super.displayDetails();
        System.out.printf("%-10s%-15s\n", "Name", name);
        System.out.printf("%-10s%-15d\n", "Age", age);
        System.out.printf("%-10s%-15s\n", "Father", fatherName);
        System.out.printf("%-10s%-15s\n", "Mother", motherName);
        System.out.printf("\n%-10s has ran %d races and won %d\n\n", name, numRacesRan, numRacesWon);

        for (int i = 0; i < raceResults.length; i++) {
            System.out.println("Race number " + (i + 1) + " was won: " + raceResults[i]);
        }// for loop
    }// Method - displayDetails
}// Class - Greyhound
