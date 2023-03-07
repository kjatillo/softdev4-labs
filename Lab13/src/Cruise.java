/**
 * Created by: Ken
 * Created on: 07/03/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Cruise extends TravelBooking {
    private boolean balcony;
    private boolean[][] tourSchedule;
    static String[] daysInWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    public Cruise(String destination, int miles, boolean balcony) {
        super(destination, miles);
        this.balcony = balcony;
    }// Constructor - Cruise

    public void populateTourSchedule(boolean[][] schedule) {
        tourSchedule = schedule;
    }// Method - populateTourSchedule

    public void checkTourSchedule() {
        System.out.printf("%-5s", " ");
        for (String s : daysInWeek) {
            System.out.printf("%-5s", s);
        }// for
        System.out.println();
        for (int row = 0; row < daysInWeek.length; row++) {
            System.out.printf("%-5s", "Tour " + (row + 1));
            for (int col = 0; col < daysInWeek.length; col++) {
                System.out.printf("%-5s", col);
            }// inner for
            System.out.println();
        }// outer for
    }// method - checkTourSchedule

    @Override
    public void calculateCost() {
        double totalCost = 0;
        double baseRate = .5;
        double tourRate = 5.5;
        double balconyCost = 200;
        int numTours = 0;
        for (int row = 0; row < daysInWeek.length; row++) {
            for (int col = 0; col < daysInWeek.length; col++) {
                if (tourSchedule[row][col]) {
                    numTours++;
                }// if
            }// inner for
        }// outer
        double baseCost = (getMiles() * baseRate) + (numTours * tourRate);

        if (balcony)
            totalCost += balconyCost;

        setCost(totalCost);
    }// Class - calculateCost
}// Class - Cruise
