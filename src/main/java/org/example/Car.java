package org.example;

public class Car extends Vehicle {
    private String brand;

    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void honk(){
        System.out.println("Honk Honk");
    }

    public void displayInfo() {
        System.out.println("Number of wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Engine size: " + getEngineSize());
        System.out.println("Fuel type: " + getFuelType());
        System.out.println("Brand: " + getBrand());
    }
}