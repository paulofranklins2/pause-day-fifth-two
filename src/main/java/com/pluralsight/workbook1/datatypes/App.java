package com.pluralsight.workbook1.datatypes;

public class App {
    int vehicleIdentificationNumber; // Unique numeric ID assigned to a vehicle
    String vehicleMake;              // Manufacturer or brand of the vehicle (e.g., Toyota, Ford)
    String vehicleColor;             // Color of the vehicle
    boolean hasTowingPackage;        // Indicates if the vehicle includes a towing package (true or false)
    double odometerReading;          // Current mileage or distance the vehicle has traveled
    char qualityRating;              // Single-character rating of the vehicle's quality (e.g., 'A', 'B')
    String phoneNumber;              // Contact phone number (stored as a String to preserve formatting)
    String socialSecurityNumber;     // SSN of the vehicle owner (stored as a String for formatting and security reasons)
    String zipCode;                  // ZIP code related to the owner's address or vehicle registration


    public App(int vehicleIdentificationNumber,
               String vehicleMake,
               String vehicleColor,
               boolean hasTowingPackage,
               double odometerReading,
               char qualityRating,
               String phoneNumber,
               String socialSecurityNumber,
               String zipCode) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
        this.vehicleMake = vehicleMake;
        this.vehicleColor = vehicleColor;
        this.hasTowingPackage = hasTowingPackage;
        this.odometerReading = odometerReading;
        this.qualityRating = qualityRating;
        this.phoneNumber = phoneNumber;
        this.socialSecurityNumber = socialSecurityNumber;
        this.zipCode = zipCode;
    }


    @Override
    public String toString() {
        return "\n" +
                "vehicleIdentificationNumber=" + vehicleIdentificationNumber + "\n" +
                "vehicleMake='" + vehicleMake + '\'' + "\n" +
                "vehicleColor='" + vehicleColor + '\'' + "\n" +
                "hasTowingPackage=" + hasTowingPackage + "\n" +
                "odometerReading=" + odometerReading + "\n" +
                "qualityRating=" + qualityRating + "\n" +
                "phoneNumber='" + phoneNumber + '\'' + "\n" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' + "\n" +
                "zipCode='" + zipCode + '\'';
    }

    public static void main(String[] args) {
        App myCar = new App(12345,
                "Toyota",
                "Red",
                true,
                50234.7,
                'A',
                "555-1234",
                "123-45-6789",
                "90210");
    }


}