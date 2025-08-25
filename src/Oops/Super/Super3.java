package Oops.Super;

class Parent3 {
    String name = "Parent";
}

class Child3 extends Parent3 {
    String name = "Child";

    void printNames() {
        System.out.println("My name: " + name);
        System.out.println("Parent’s name: " + super.name);
    }
}

public class Super3 {
    public static void main(String[] args) {
        new Child3().printNames();
    }
}

