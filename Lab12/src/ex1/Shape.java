package ex1;

/**
 * Created by: Ken
 * Created on: 05/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public abstract class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }// Constructor - Shape

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }// Method - toString

    public abstract String getName();  // Abstract method - getName
}// Class - Shape
