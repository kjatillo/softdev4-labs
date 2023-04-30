import java.text.DecimalFormat;

/**
 * Created by: Ken
 * Created on: 23/03/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class RefuseTruck {
    DecimalFormat df = new DecimalFormat("#,##0.00");
    private int maxBins;
    private int numBinsDeclined;
    private int numBinsCollected;
    private double ratePerKilogram;
    private double totalWeight;

    public RefuseTruck(int maxBins, double ratePerKilogram) {
        this.maxBins = maxBins;
        this.ratePerKilogram = ratePerKilogram;
        numBinsCollected = 0;
        numBinsDeclined = 0;
    }// Constructor - RefuseTruck

    public int getNumBinsCollected() {
        return numBinsCollected;
    }// Getter - getNumBinsCollected

    public int getMaxBins() {
        return maxBins;
    }// Getter - getMaxBins

    public double getTotalWeight() {
        return totalWeight;
    }// Getter - getTotalWeight

    public boolean collectBin(double binWeight) {
        final double WEIGHT_LIMIT = 100;
        boolean overweight = false;

        if (binWeight <= WEIGHT_LIMIT) {
            numBinsCollected++;
            totalWeight += binWeight;
        } else if (binWeight > WEIGHT_LIMIT) {
            System.out.println("Bin is over the 100kg weight limit. Collection has been declined!");
            numBinsDeclined++;
            overweight = true;
        }// if-else

        return overweight;
    }// Method - collectBin

    public void printStats() {
        System.out.println();
        System.out.println("Bins Collected: " + numBinsCollected);
        System.out.println("Bins Declined: " + numBinsDeclined);

        double averageBinWeight = totalWeight / numBinsCollected;
        System.out.printf("Average Bin Weight: %.2fKg\n", averageBinWeight);

        double averageCostCollectedBin = (totalWeight / numBinsCollected) * ratePerKilogram;
        System.out.println("Average Cost of Collected Bins: €" + df.format(averageCostCollectedBin));
    }// Method - printStats
}// Class RefuseTruck
