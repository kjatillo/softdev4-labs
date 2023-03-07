package ex2;

/**
 * Created by: Ken
 * Created on: 07/03/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class RockBand {
    private String bandName;
    private String recordCompany;
    private Musician[] members;

    public RockBand(String bandName, String recordCompany, String[] names, String[] instruments) {
        this.bandName = bandName;
        this.recordCompany = recordCompany;
        members = new Musician[names.length];

        for (int i = 0; i < members.length; i++) {
            members[i] = new Musician(names[i], instruments[i]);
        }// for
    }// Constructor - RockBand

    public boolean changeRecordCompany(String newCompany) {
        if (recordCompany.equals(newCompany)) {
            return false;
        } else {
            recordCompany = newCompany;
            return true;
        }// if-else
    }// Method - changeRecordCompany

    public String toString() {
        String str = "";

        str += String.format("%-10s\n%15s%15s\n%15s%15s\n", "Rock Band:", "Name:", bandName, "Record Company:",
                recordCompany);

        for (int i = 0; i < members.length; i++) {
            str += members[i];
        }// for

        return str;
    }// Method - toString
}// Class - RockBand
