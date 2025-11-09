package Java8.Annotations;

import java.util.ArrayList;
import java.util.List;

public class A3 {
    public static void main(String[] args) {
        new Example().demo();
    }
}

class Example {
    void demo() {
        @SuppressWarnings("rawtypes")
        List list = new ArrayList();  // raw type
        list.add("Hello");
        list.add(123);
        System.out.println(list);
    }
}





//@SuppressWarnings({
//        "all",
//        "deprecation",
//        "unchecked",
//        "rawtypes",
//        "unused",
//        "fallthrough",
//        "serial",
//        "cast",
//        "static-access",
//        "path",
//        "module",
//        "exports",
//        "opens"
//})
