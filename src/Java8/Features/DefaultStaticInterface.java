package Java8.Features;

interface A {
    void show();
    default void greet() {
        System.out.println("Hello from A (default)");
    }
    static void info() {
        System.out.println("Static method in A");
    }
}
interface B {
    default void greet() {
        System.out.println("Hello from B (default)");
    }
    static void info() {
        System.out.println("Static method in B");
    }
}
class MyClass implements A, B {
    @Override
    public void show() {
        System.out.println("Show method implementation");
    }
    @Override
    public void greet() {
        System.out.println("MyClass override greet");
        A.super.greet();
        B.super.greet();
    }
}

public class DefaultStaticInterface {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
//        obj.show();
//        obj.greet();
//        A.info();
//        B.info();
//         obj.info();
    }
}
