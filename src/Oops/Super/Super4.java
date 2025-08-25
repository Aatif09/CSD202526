package Oops.Super;


class Vehicle {
    Vehicle(String type) {
        System.out.println("Vehicle type: " + type);
    }
}

class Car extends Vehicle {
    Car(String brand) {
        super("Car");  // call Vehicle constructor
        System.out.println("Brand: " + brand);
    }
}

public class Super4 {
    public static void main(String[] args) {
        new Car("Toyota");
    }
}
