package ex1;

/**
 * Created by: Ken
 * Created on: 05/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Circle extends TwoDShape {
    public Circle(int x, int y, double radius) {
        super(x, y, radius, radius);
    }// Constructor - Circle

    @Override
    public String getName() {
        return "Circle";
    }// Method - getName

    public double getRadius() {
        return getLength();
    }// Method - getRadius

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }// Method - getArea

    @Override
    public String toString() {
        return getName() + super.toString() + " radius: " + getRadius();
    }// Method - toString
}// Class - Circle
