package Oops.Relationship;

interface Animal
{
    void eat();
}
class Dog implements Animal
{
    public void eat()
    {
        System.out.println("Dog eats.");
    }
}
public class Interface
{
    public static void main(String[] args)
    {
        Dog myDog = new Dog();
        myDog.eat(); // inherited from Animal

        //Animal myAnimal = new Animal();   // error because we cannot create an object of an interface
    }
}