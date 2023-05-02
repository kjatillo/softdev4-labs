package ex1;

/**
 * Created by: Keneith Atillo
 * Created on: 02/05/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class Vehicle {
    private String make;
    private String model;
    private double purchasePrice;
    private double shippingCost;
    private char port;
    private double sellingPrice;

    public Vehicle(String make, String model, double purchasePrice, double shippingCost, char port, double sellingPrice) {
        this.make = make;
        this.model = model;
        this.purchasePrice = purchasePrice;
        this.shippingCost = shippingCost;
        this.port = port;
        this.sellingPrice = sellingPrice;
    }// Constructor - Vehicle

    public String getMake() {
        return make;
    }// Getter - make

    public String getModel() {
        return model;
    }// Getter - model

    public double getPurchasePrice() {
        return purchasePrice;
    }// Getter - purchasePrice

    public double getSellingPrice() {
        return sellingPrice;
    }// Getter - sellingPrice

    public char getPort() {
        return port;
    }// Getter - port

    public double getShippingCost() {
        return shippingCost;
    }// Getter - shippingCost

    public String getPortName(char port) {
        String portName = "";

        if (port == 'o') {
            portName = "Osaka";
        } else if (port == 't') {
            portName = "Tokyo";
        }

        return portName;
    }// Method - getPortName
}// Class - Vehicle
