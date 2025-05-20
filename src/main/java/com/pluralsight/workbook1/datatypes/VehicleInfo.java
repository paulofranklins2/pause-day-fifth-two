package com.pluralsight.workbook1.datatypes;

public class VehicleInfo {
    public static void main(String[] args) {
        int vehicleIdentificationNumber = 10;         // Unique numeric ID assigned to a vehicle
        String vehicleMake = "Ford";                  // Manufacturer or brand of the vehicle
        String vehicleColor = "Blue";                 // Color of the vehicle
        boolean hasTowingPackage = true;              // Indicates if the vehicle includes a towing package
        double odometerReading = 12345.67;            // Current mileage or distance the vehicle has traveled
        char qualityRating = 'A';                     // Single-character rating of the vehicle's quality
        String phoneNumber = "123-456-7890";          // Contact phone number
        String socialSecurityNumber = "123-45-6789";  // SSN of the vehicle owner
        String zipCode = "90210";                     // Zip code of the vehicle owner

        System.out.println("Vehicle Information:");
        System.out.println("VIN: " + vehicleIdentificationNumber);
        System.out.println("Make: " + vehicleMake);
        System.out.println("Color: " + vehicleColor);
        System.out.println("Has Towing Package: " + hasTowingPackage);
        System.out.println("Odometer: " + odometerReading);
        System.out.println("Quality Rating: " + qualityRating);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("SSN: " + socialSecurityNumber);
        System.out.println("Zip Code: " + zipCode);

    }
}
