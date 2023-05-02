package ex1;

/**
 * Created by: Keneith Atillo
 * Created on: 02/05/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class ImportDutyExceedsLimit extends Exception {
    public ImportDutyExceedsLimit() {
        super("Duty too high - Purchase cancelled");
    }// Constructor - ImportDutyExceedsLimit
}// Class - ImportDutyExceedsLimit
