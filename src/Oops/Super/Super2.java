package Oops.Super;

class Parent2 {
    Parent2() {
        System.out.println("Parent is ready.");
    }
}

class Child2 extends Parent {
    Child2() {
        super();  // calls Parent() first
        System.out.println("Child is ready.");
    }
}

public class Super2 {
    public static void main(String[] args) {
        new Child2();
    }
}

