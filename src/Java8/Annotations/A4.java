package Java8.Annotations;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@interface Info {
    String value();
}

@Info("Class Level Info")
class MyService {

    @Info("Field Level Info")
    String message = "Hello";

    @Info("Method Level Info")
    void doWork() {
        System.out.println("Doing work...");
    }
}

public class A4 {
    public static void main(String[] args) {
        MyService service = new MyService();
        System.out.println("[Field Info] Field Level Info: " + service.message);
        System.out.println("[Method Info] Method Level Info");
        service.doWork();
    }
}

