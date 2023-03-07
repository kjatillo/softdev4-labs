package ex1;

public abstract class Shape {
    private String colour;
    private String type;
    protected double area;

    public Shape(String type, String colour) {
        this.type = type;
        this.colour = colour;
        area = 0.0;
    }// Constructor - Shape

    public String toString() {
        return "Type of shape: " + type + "\n" + "Colour of shape: " + colour + "\n";
    }// Method - toString

    public abstract void calcArea();  // Abstract Method - calcArea
}// Class - Shape
