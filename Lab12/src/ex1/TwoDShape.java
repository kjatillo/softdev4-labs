package ex1;

/**
 * Created by: Ken
 * Created on: 05/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public abstract class TwoDShape extends Shape {
    private double length;
    private double width;

    public TwoDShape(int x, int y, double length, double width) {
        super(x, y);
        this.length = length;
        this.width = width;
    }// Constructor - TwoDShape

    // Create appropriate getter methods
    public double getLength() {
        return length;
    }// Method - getLength

    public double getWidth() {
        return width;
    }// Method - getWidth

    public abstract double getArea();  // Abstract method - getArea
}// Class - TwoDShape
