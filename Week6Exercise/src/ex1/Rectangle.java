package ex1;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String type, String colour, double length, double width) {
        super(type, colour);
        this.length = length;
        this.width = width;
    }// Constructor - Rectangle

    public String toString() {
        String str = super.toString();
        str += "Rectangle of length=" + length + " and width=" + width;

        return str;
    }// Method - toString

    public void calcArea() {
        area = length * width;
        System.out.printf("Area: %.2f\n", area);
    }// Method - calcArea
}// Class - Rectangle

