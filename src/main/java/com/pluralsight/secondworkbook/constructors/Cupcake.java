package com.pluralsight.secondworkbook.constructors;

public class Cupcake {
    private String flavor;
    private double calories;

    Cupcake(String flavor, double calories) {
        this.flavor = flavor;
        this.calories = calories;
        System.out.println("Created a cupcake : " + flavor + " calories: " + calories);
        isHealth();
    }

    public boolean isHealth() {
        boolean isHealthy = this.calories < 200;
        if (isHealthy) {
            System.out.println("The cupcake is healthy");
        } else System.out.println("The cupcake is unhealthy");
        return isHealthy;
    }
}
