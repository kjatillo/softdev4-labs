package ex1;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle("Rectangle", "Red", 4, 5),
                new Triangle("Triangle", "Blue", 4, 5),
                new Circle("Circle", "Black", 9),
                new Cylinder("Cylinder", "Indigo", 5, 9)
        };

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("----------------------------------------");
            System.out.println("Shape: " + (i + 1));
            System.out.println(shapes[i]);  // Implicit call
            shapes[i].calcArea();
            if (shapes[i] instanceof Cylinder) {
                Cylinder c = (Cylinder) shapes[i];
                c.calcVolume();
            }// if
        }// for loop
    }// Main
}// Class - TestShape
