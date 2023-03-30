/**
 * Student Name: Keneith Atillo
 * Student Number: X00190944
 * */

package ex1;

public class OnlineJournal extends Rental {
    private int printingLimit;
    private double monthlyPrice;
    private int numSubscription;

    public OnlineJournal(String title, int year, int printingLimit, double monthlyPrice, int numSubscription) {
        super(title, year);
        this.printingLimit = printingLimit;
        this. monthlyPrice = monthlyPrice;
        this.numSubscription = numSubscription;
    }// Constructor - OnlineJournal

    public double getMonthlyPrice() {
        return monthlyPrice;
    }// Getter - getMonthlyPrice

    public int getNumSubscription() {
        return numSubscription;
    }// Getter - getNumSubscription

    @Override
    public String toString() {
        String str = super.toString();
        str += "Printing Limit: " + printingLimit + "\nMonthly Price: " + monthlyPrice + "\nNo. of Subscriptions: " +
                numSubscription + "\n";

        return str;
    }// Method - toString

    @Override
    public void processReturn() {
        numSubscription -= 1;
        System.out.println("Subscription Ended!");
    }// Method - processReturn
}// Class - OnlineJournal
