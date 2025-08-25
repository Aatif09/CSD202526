package Oops.Super;
class Parent {
    void cook() {
        System.out.println("Parent cooks plain rice.");
    }
}

class Child extends Parent {
    void cook() {
        super.cook();   // ask Parent to cook first
        System.out.println("Child adds curry.");
    }
}

public class Super1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.cook();
    }
}
