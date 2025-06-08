package kar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class RentalSystemTest {
    
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle [] {
            new Car("Toyota", "Camry", 50, 4),
            new Truck("Volvo", "FH16", 120, 18),
            new Motorcycle("Yamaha", "R3", 30, true),
            new ElectricCar("Tesla", "Model S", 90, 100)
        };

        int rentalDays = 5;
        double discount = 10; 

        for (Vehicle v : vehicles) {
            System.out.println("\n--- Vehicle Details ---");
            v.displayDetails();
            System.out.println("Rental Cost for " + rentalDays + " days: $" + v.calculateRentalCost(rentalDays));
            System.out.println("Discounted Cost (10%): $" + v.calculateDiscountedRentalCost(rentalDays, discount));
            v.performMaintenance();
        }

        System.out.println("\nBattery Info for Electric Car:");
        ((ElectricCar)vehicles[3]).displayBatteryInfo();
    }
}