package ex1;

/**
 * Created by: Ken
 * Created on: 05/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Sphere extends ThreeDShape {
    public Sphere(int x, int y, double radius) {
        super(x, y, radius, radius, radius);
    }// Constructor - Sphere

    @Override
    public String getName() {
        return "Sphere";
    }// Method - getName

    public double getRadius() {
        return getLength();
    }// Method - getRadius

    public double getArea() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }// Method - getArea

    public double getVolume() {
        return (4/3.0) * Math.PI * Math.pow(getRadius(), 3);
    }// Method - getVolume

    @Override
    public String toString() {
        return getName() + super.toString() + " radius: " + getRadius();
    }// Method - toString
}// Class - Sphere
