package ex2;

import ex1.Shape;
import ex1.ThreeDShape;
import ex1.TwoDShape;

/**
 * Created by: Ken
 * Created on: 05/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Paint {
    private double coverage;

    public Paint(double coverage) {
        this.coverage = coverage;
    }// Constructor - Paint

    public double calcAmount(Shape shape) {
        double amount = 0;
        if (shape instanceof TwoDShape) {
            TwoDShape shape2D = (TwoDShape) shape;

            amount = shape2D.getArea() / coverage;
        } else if (shape instanceof ThreeDShape) {
            ThreeDShape shape3D = (ThreeDShape) shape;

            amount = shape3D.getArea() / coverage;
        }
        return amount;
    }// Method - calcAmount
}// Class - Paint
