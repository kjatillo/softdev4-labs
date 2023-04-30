package ex1;

/**
 * Created by: Ken
 * Created on: 31/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Passenger {
    private String name;
    private int age;
    private double[] bagWeightList;
    private char[] bagSizeList;

    public Passenger(String name, int age, double[] bagWeightList, char[] bagSizeList) {
        this.name = name;
        this.age = age;
        this.bagWeightList = bagWeightList;
        this.bagSizeList = bagSizeList;
    }// Constructor - Passenger

    public String getName() {
        return name;
    }// Getter - getName

    public int getAge() {
        return age;
    }// Getter - getAge

    public double[] getBagWeightList() {
        return bagWeightList;
    }// Getter - getBagWeightList

    public char[] getBagSizeList() {
        return bagSizeList;
    }// Getter - getBagSizeList

    public void setName(String name) {
        this.name = name;
    }// Setter - setName

    public void setAge(int age) {
        this.age = age;
    }// Setter - setAge

    public void setBagWeightList(double[] bagWeightList) {
        this.bagWeightList = bagWeightList;
    }// Setter - setBagWeightList

    public void setBagSizeList(char[] bagSizeList) {
        this.bagSizeList = bagSizeList;
    }// Setter - setBagSizeList

    public double calcBaggageCharge() {
        final double WEIGHT_MEDIUM_LIMIT = 15.0;
        final double WEIGHT_LARGE_LIMIT = 20.0;
        final double CHARGE_MEDIUM = 30.0;
        final double CHARGE_LARGE = 40.0;
        final double CHARGE_EXCESS = 10.0;
        double excessWeight;
        double totalCharge = 0;

        for (int i = 0; i < bagWeightList.length; i++) {
            if (bagSizeList[i] == 'm') {
                totalCharge += CHARGE_MEDIUM;

                if (bagWeightList[i] > WEIGHT_MEDIUM_LIMIT) {
                    excessWeight = bagWeightList[i] - WEIGHT_MEDIUM_LIMIT;
                    totalCharge += excessWeight * CHARGE_EXCESS;
                }// inner-if
            } else if (bagSizeList[i] == 'l') {
                totalCharge += CHARGE_LARGE;

                if (bagWeightList[i] > WEIGHT_LARGE_LIMIT) {
                    excessWeight = bagWeightList[i] - WEIGHT_LARGE_LIMIT;
                    totalCharge += excessWeight * CHARGE_EXCESS;
                }// inner-if
            }// if - else
        }// for

        return totalCharge;
    }// Method - calcBaggageCharge
}// Class - Passenger
