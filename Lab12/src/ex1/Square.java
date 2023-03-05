package ex1;

/**
 * Created by: Ken
 * Created on: 05/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Square extends TwoDShape {
    public Square(int x, int y, double side) {
        super(x, y, side, side);
    }// Constructor - Square

    @Override
    public String getName() {
        return "Square";
    }// Method - getName

    public double getSide() {
        return getLength();
    }// Method - getSide

    public double getArea() {
        return Math.pow(getSide(), 2);
    }// Method - getArea

    @Override
    public String toString() {
        return getName() + super.toString() + " side: " + getSide();
    }// Method - toString
}// Class - Square
