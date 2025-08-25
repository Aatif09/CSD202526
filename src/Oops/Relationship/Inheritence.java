package Oops.Relationship;
class Vehicle
{
    void start()
    {
        System.out.println("Vehicle starts.");
    }
}
class Car extends Vehicle
{
    void drive()
    {
        System.out.println("Car drives.");
    }
}
public class Inheritence
{
    public static void main(String[] args)
    {
        Car myCar = new Car();
        myCar.start();
        myCar.drive();
    }
}
