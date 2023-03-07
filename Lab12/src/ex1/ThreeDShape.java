package ex1;

/**
 * Created by: Ken
 * Created on: 05/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public abstract class ThreeDShape extends Shape {
    // create 3 private double member variables to represent
    //the three dimensions of a 3D shape.
    private double length;
    private double width;
    private double height;

    public ThreeDShape(int x, int y, double length, double width, double height) {
        super(x, y);
        this.length = length;
        this.width = width;
        this.height = height;
    }// Constructor - ThreeDShape

    public double getLength() {
        return length;
    }// Method - getLength

    public double getWidth() {
        return width;
    }// Method - getWidth

    public double getHeight() {
        return height;
    }// Method - getHeight

    public abstract double getArea();
    public abstract double getVolume();
}// Class - ThreeDShape
