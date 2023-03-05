package ex1;

import ex2.Paint;

/**
 * Created by: Ken
 * Created on: 05/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class TestShape {
    static String minPaintShape = null;
    static String maxPaintShape = null;
    static double maxPaintValue = Double.MIN_VALUE;
    static double minPaintValue = Double.MAX_VALUE;
    static double totalPaintRequired = 0;

    public static double calculatePaint(Shape shape) {
        Paint paint = new Paint(70);
        double paintRequired = paint.calcAmount(shape);
        if (paintRequired > maxPaintValue) {
            maxPaintValue = paintRequired;
            maxPaintShape = shape.getName();
        }// if

        if (paintRequired < minPaintValue) {
            minPaintValue = paintRequired;
            minPaintShape = shape.getName();
        }// if

        return paintRequired;
    }// Method - calculatePaint

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(22, 88, 4);
        shapes[1] = new Square(71, 96, 10);
        shapes[2] = new Sphere(8, 89, 4);
        shapes[3] = new Cube(79, 61, 8);

        for (Shape shape : shapes) {
            if (shape instanceof TwoDShape) {
                TwoDShape shape2D = (TwoDShape) shape;
                double paintRequired = calculatePaint(shape);
                totalPaintRequired += paintRequired;

                System.out.println(shape2D);
                System.out.printf("Area of a %s is %.2f\n", shape2D.getName(), shape2D.getArea());
                System.out.printf("Amount of paint required for %s is %.2f\n", shape2D.getName(), paintRequired);
            } else if (shape instanceof ThreeDShape) {
                ThreeDShape shape3D = (ThreeDShape) shape;
                double paintRequired = calculatePaint(shape);

                System.out.println(shape3D);
                System.out.printf("Area of a %s is %.2f\n", shape3D.getName(), shape3D.getArea());
                System.out.printf("Volume of a %s is %.2f\n", shape3D.getName(), shape3D.getVolume());
                System.out.printf("Amount of paint required for %s is %.2f\n", shape3D.getName(), paintRequired);
                totalPaintRequired += paintRequired;
            } else {
                System.out.println("Unknown shape!");
            }// if-else
            System.out.println();
        }// for

        System.out.printf("\nThe total amount of paint required is: %.2f\n", totalPaintRequired);
        System.out.println("The name of the shape that requires the most paint is: " + maxPaintShape);
        System.out.println("The name of the shape that requires the least paint is: " + minPaintShape);
    }// Main
}// Class - TestShape
