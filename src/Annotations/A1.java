package Annotations;

class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

public class A1 extends Animal {
    public static void main(String[] args) {
        A1 a=new A1();
        a.sound();
    }
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

