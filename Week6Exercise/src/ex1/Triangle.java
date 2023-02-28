package ex1;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String type, String colour, int base, int height) {
        super(type, colour);
        this.base = base;
        this.height = height;
    }// Constructor - Triangle

    public String toString() {
        String str = super.toString();
        str += "Triangle of base=" + base + " and height=" + height;

        return str;
    }// Method - toString

    public void calcArea() {
        area = 0.5 * base * height;
        System.out.printf("Area : %.2f\n", area);
    }// Method - calcArea
}// Class - Triangle
