package kar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class ElectricCar extends Vehicle {
    private double batteryCapacity;

    public ElectricCar(String make, String model, double rentalPrice, double batteryCapacity) {
        super(make, model, rentalPrice);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    public void displayBatteryInfo() {
        System.out.println("Battery Capacity Info: " + batteryCapacity + " kWh");
    }

    @Override
    public void performMaintenance() {
        System.out.println("Checking battery health and charging system.");
    }
}