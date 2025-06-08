package kar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class Motorcycle extends Vehicle {
    private boolean hasHelmetRental;

    public Motorcycle(String make, String model, double rentalPrice, boolean hasHelmetRental) {
        super(make, model, rentalPrice);
        this.hasHelmetRental = hasHelmetRental;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Helmet Rental Available: " + (hasHelmetRental ? "Yes" : "No"));
    }

    @Override
    public void performMaintenance() {
        System.out.println("Inspecting brakes and tire pressure for the motorcycle.");
    }
}