/**
 * Created by: Ken
 * Created on: 01/05/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Food extends Goods {
    private double calories;

    public Food(String description, double price, double calories) {
        super(description, price);
        this.calories = calories;
    }// Constructor

    public void print() {
        super.print();
        System.out.printf("Calories: %.2f\n", calories);
    }// Method - print
}// Class - Food
