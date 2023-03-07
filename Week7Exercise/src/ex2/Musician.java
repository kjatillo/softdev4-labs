package ex2;

/**
 * Created by: Ken
 * Created on: 07/03/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Musician extends Person {
    private String instrumentName;

    public Musician(String name, String instrumentName) {
        super(name);
        this.instrumentName = instrumentName;
    }// Constructor - Musician

    public String getInstrumentName() {
        return instrumentName;
    }// Getter - instrumentName

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }// Setter - instrumentName

    public String toString() {
        return super.toString() + " plays " + getInstrumentName() + "\n";
    }// Method - toString
}// Class - Musician
