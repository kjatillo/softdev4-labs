package ex1;

public class Cylinder extends Circle {
    private double height;
    private double volume;

    public Cylinder(String type, String colour, double radius, double height) {
        super(type, colour, radius);
        this.height = height;
        this.volume = 0.0;
    }// Constructor - Cylinder

    public String toString() {
        String str = super.toString();
        str += "Height: " + height;

        return str;
    }// Method - toString

    public void calcArea() {
        area = (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
        System.out.printf("Area: %.2f\n", area);
    }// Method - calcArea

    public void calcVolume() {
        volume = Math.PI * radius * radius * height;
        System.out.printf("Volume: %.2f\n", volume);
    }// Method - calcVolume
}// Class - Cylinder
