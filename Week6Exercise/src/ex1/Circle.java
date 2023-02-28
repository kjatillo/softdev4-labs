package ex1;

public class Circle extends Shape {
    protected double radius;

    public Circle(String type, String colour, double radius) {
        super(type, colour);
        this.radius = radius;
    }// Constructor - Circle

    public String toString() {
        String str = super.toString();
        str += "Radius: " + radius + "\n";

        return str;
    }// Method - toString

    public void calcArea() {
        area = Math.PI * radius * radius;
        System.out.printf("Area: %.2f\n", area);
    }// Method - calcArea
}// Class - Circle
