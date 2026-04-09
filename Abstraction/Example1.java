abstract class Vehicle {

    String brand;

    // Constructor
    Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method
    abstract void startEngine();

    // Concrete method
    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}


class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    void startEngine() {
        System.out.println("Car engine starts with key ignition");
    }
}


class Bike extends Vehicle {

    Bike(String brand) {
        super(brand);
    }

    void startEngine() {
        System.out.println("Bike engine starts with self-start button");
    }
}


public class Example1 {
    public static void main(String[] args) {

        Vehicle v1 = new Car("Toyota");
        Vehicle v2 = new Bike("Yamaha");

        v1.displayBrand();
        v1.startEngine();

        System.out.println();

        v2.displayBrand();
        v2.startEngine();
    }
}