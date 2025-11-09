package Java8.Annotations;

import java.lang.annotation.*;

// 1) SOURCE retention
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@interface SourceAnno {
    String value();
}

// 2) CLASS retention
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface ClassAnno {
    String value();
}

// 3) RUNTIME retention
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RuntimeAnno {
    String value();
}

class Examples {

    @SourceAnno("I exist only in source code")
    void sourceMethod() {
        System.out.println("SOURCE method");
    }

    @ClassAnno("I exist in the .class file only")
    void classMethod() {
        System.out.println("CLASS method");
    }

    @RuntimeAnno("I exist at runtime")
    void runtimeMethod() {
        System.out.println("RUNTIME method");
    }
}

public class A5 {
    public static void main(String[] args) throws Exception {
        Examples ex = new Examples();

        ex.sourceMethod();
        ex.classMethod();
        ex.runtimeMethod();

        System.out.println("\n--- Runtime Annotation Check ---");

        var m1 = Example.class.getDeclaredMethod("sourceMethod");
        System.out.println("sourceMethod has RuntimeAnno? " + m1.isAnnotationPresent(RuntimeAnno.class));

        var m2 = Example.class.getDeclaredMethod("classMethod");
        System.out.println("classMethod has RuntimeAnno? " + m2.isAnnotationPresent(RuntimeAnno.class));

        var m3 = Example.class.getDeclaredMethod("runtimeMethod");
        System.out.println("runtimeMethod has RuntimeAnno? " + m3.isAnnotationPresent(RuntimeAnno.class));
    }
}
