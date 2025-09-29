package Collections.Examples;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Zebra");
        set.add("Monkey");
        set.add("Elephant");

        System.out.println("LinkedHashSet (maintains order): " + set);
    }
}

