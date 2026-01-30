package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(4, "Red", 1.6f, "Gasoline");
        Car car1 = new Car(6, "White", 300.2f, "Electric", "Tesla");

    //Vehicle method tests
        System.out.println("--- VEHICLE1 ---");
        System.out.println("Number of wheels: " + vehicle1.getNumberOfWheels());
        System.out.println("Color: " + vehicle1.getColor());
        System.out.println("Engine Size: " + vehicle1.getEngineSize());
        System.out.println("Fuel Type: " + vehicle1.getFuelType());

        //Car method test
        System.out.println("--- CAR1 ---");
        System.out.println("Number of wheels: " + car1.getNumberOfWheels());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Engine Size: " + car1.getEngineSize());
        System.out.println("Fuel Type: " + car1.getFuelType());
        System.out.println("Brand Type: " + car1.getBrand());

        //Honk (car method)
        System.out.println("--- HONK METHOD ---");
        car1.honk();

        //displayInfo (car method)
        System.out.println("--- DISPLAY INFO METHOD ---");
        car1.displayInfo();
    }
}