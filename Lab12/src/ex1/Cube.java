package ex1;

/**
 * Created by: Ken
 * Created on: 05/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Cube extends ThreeDShape {
    public Cube(int x, int y, double side) {
        super(x, y, side, side, side);
    }// Constructor - Cube

    @Override
    public String getName() {
        return "Cube";
    }// Method - getName

    public double getSide() {
        return getLength();
    }// Method - getSide

    public double getArea() {
        return 6 * Math.pow(getSide(), 2);
    }// Method - getArea

    public double getVolume() {
        return Math.pow(getSide(), 3);
    }// Method - getVolume

    @Override
    public String toString() {
        return getName() + super.toString() + " side: " + getSide();
    }// Method - toString
}// Class - Cube
