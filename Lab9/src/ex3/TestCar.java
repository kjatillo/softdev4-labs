package ex3;

public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car("John Murphy", 10, true);
        Car c2 = new Car("Molly Malone", 5, false);

        c1.displayDetails();
        System.out.println("Cost is €" + c1.calculateCost());
        c2.displayDetails();
        System.out.println("Cost is €" + c2.calculateCost());
    }// Main
}// Class - TestCar
