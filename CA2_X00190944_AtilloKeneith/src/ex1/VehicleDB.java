package ex1;

/**
 * Created by: Keneith Atillo
 * Created on: 02/05/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class VehicleDB implements IRates {
    DecimalFormat df = new DecimalFormat("#,##0.00");
    private ArrayList<Vehicle> vehicleList;

    public VehicleDB() {
        vehicleList = new ArrayList<>();
    }// Constructor - VehicleDB

    public void addVehicle(String make, String model, double purchasePrice, double shippingCost, char port, double sellingPrice) {
        Vehicle vehicle = new Vehicle(make, model, purchasePrice, shippingCost, port, sellingPrice);
        vehicleList.add(vehicle);
    }// Method - addVehicle

    public void displayList() {
        System.out.printf("%-3s%-15s%-25s%-15s%-15s%-10s%-15s\n",
                "#", "Make", "Model", "Purchase Price", "Shipping Cost", "Port", "Selling Price");
        int count = 1;
        for (Vehicle vehicle : vehicleList) {
            System.out.printf("%-3d%-15s%-25s%-15s%-15s%-10s%-15s\n",
                    count, vehicle.getMake(), vehicle.getModel(), "€" + df.format(vehicle.getPurchasePrice()),
                    "€" + df.format(vehicle.getShippingCost()), vehicle.getPortName(vehicle.getPort()),
                    "€" + df.format(vehicle.getSellingPrice()));
            count++;
        }// for
    }// Method - displayList

    public void calcMostExpensive() {
        double highestPrice = 0;
        ArrayList<Vehicle> mostExpensiveCarsList = new ArrayList<>();

        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getSellingPrice() > highestPrice) {
                highestPrice = vehicle.getSellingPrice();
            }// if
        }// for

        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getSellingPrice() == highestPrice) {
                mostExpensiveCarsList.add(vehicle);
            }// if
        }// for

        System.out.println("Most Expensive Cars");
        System.out.printf("%-25s%-15s\n", "Model", "Selling Price");
        for (Vehicle vehicle : mostExpensiveCarsList) {
            System.out.printf("%-25s%-15s\n", vehicle.getModel(), "€" + df.format(vehicle.getSellingPrice()));
        }// for
    }// Method - calcMostExpensive

    public void calcImportDuty() {
        final double IMPORT_LIMIT = 6000;
        double portDuty;
        double vat;
        double importCost = 0;
        double totalCost = 0;

        System.out.printf("%-25s%-15s%-15s%-15s\n", "Model", "Cost", "Import Cost", "Total Cost");
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getPort() == 'o') {
                portDuty = (vehicle.getPurchasePrice() + vehicle.getShippingCost()) * PORT_DUTY_OSAKA;
                vat = (vehicle.getPurchasePrice() + vehicle.getShippingCost() + portDuty) * VAT;
                importCost = portDuty + vat + UNLOADING_FEE_OSAKA + BROKER_FEE;
                totalCost = vehicle.getPurchasePrice() + vehicle.getShippingCost() + importCost;
            } else if (vehicle.getPort() == 't') {
                portDuty = (vehicle.getPurchasePrice() + vehicle.getShippingCost()) * PORT_DUTY_TOKYO;
                vat = (vehicle.getPurchasePrice() + vehicle.getShippingCost() + portDuty) * VAT;
                importCost = portDuty + vat + UNLOADING_FEE_TOKYO + BROKER_FEE;
                totalCost = vehicle.getPurchasePrice() + vehicle.getShippingCost() + importCost;
            }// if-else

            if (importCost > IMPORT_LIMIT) {
                try {
                    throw new ImportDutyExceedsLimit();
                } catch (ImportDutyExceedsLimit err) {
                    System.out.println(err.getMessage());
                }// try-catch
            }// if

            double cost = vehicle.getPurchasePrice() + vehicle.getShippingCost();
            System.out.printf("%-25s%-15s%-15s%-15s\n", vehicle.getModel(), "€" + df.format(cost),
                    "€" + df.format(importCost), "€" + df.format(totalCost));
        }// for
    }// Method - calcImportDuty

    public void sortVehicles() {
        Collections.sort(vehicleList, new NameComparator());
    }// Method - sortVehicles
}// Class - VehicleDB
