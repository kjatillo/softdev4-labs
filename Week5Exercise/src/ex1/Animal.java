package ex1;

/**
 * Created by: Ken
 * Created on: 21/02/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class Animal {
    private final int animalId;
    private final String animalType;

    public Animal(int id, String type) {
        this.animalId = id;
        this.animalType = type;
    }// Constructor - Animal

    public void displayDetails() {
        System.out.println("[Animal Details]");
        System.out.printf("%-10s%-15d\n", "ID", animalId);
        System.out.printf("%-10s%-15s\n", "Type", animalType);
    }// Method - displayDetails
}// Class - Animal
