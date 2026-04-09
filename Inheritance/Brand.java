class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Type: " + fuelType);
    }
}

class SportsCar extends Car {
    double accelerationTime;

    SportsCar(String brand, int speed, String fuelType, double accelerationTime) {
        super(brand, speed, fuelType);
        this.accelerationTime = accelerationTime;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Acceleration Time: " + accelerationTime);
    }
}

public class Brand {
    public static void main(String[] args) {
        SportsCar s = new SportsCar("Ferrari", 300, "Petrol", 3.2);
        s.displayDetails();
    }
}