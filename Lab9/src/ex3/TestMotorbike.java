package ex3;

public class TestMotorbike {
    public static void main(String[] args) {
        Motorbike mb1 = new Motorbike("Joe Bloggs", 20);
        Motorbike mb2 = new Motorbike("Jane Doe", 4);

        mb1.displayDetails();
        System.out.println("Cost is €" + mb1.calculateCost());
        mb2.displayDetails();
        System.out.println("Cost is €" + mb2.calculateCost());
    }// Main
}// Class - TestMotorbike
