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
        int sum;

        for (int col = 0; col < daysInWeek.length; col++) {
            sum = 0;
            for (int row = 0; row < tourSchedule.length; row++) {
                if(!tourSchedule[row][col])
                    sum++;
            }// inner for
            if (sum == 3)
                System.out.println("No tour scheduled for " + daysInWeek[col]);
        }// outer for
    }// Method - checkTourSchedule

    @Override
    public void calculateCost() {
        double totalCost;
        double baseRate = .5;
        double tourRate = 5.5;
        double balconyCost = 200;
        int numTours = 0;
        for (int row = 0; row < tourSchedule.length; row++) {
            for (int col = 0; col < daysInWeek.length; col++) {
                if (tourSchedule[row][col]) {
                    numTours++;
                }// if
            }// inner for
        }// outer

        double baseCost = (getMiles() * baseRate) + (numTours * tourRate);

        if (balcony) {
            totalCost = baseCost + balconyCost;
        } else {
            totalCost = baseCost;
        }// if-else

        setCost(totalCost);
    }// Class - calculateCost
}// Class - Cruise
