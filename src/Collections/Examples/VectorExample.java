package Collections.Examples;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("One");
        vector.add("Two");
        vector.add("Three");

        System.out.println("Element at index 1: " + vector.get(1));

        vector.remove(2);

        System.out.println("Updated Vector: " + vector);
    }
}

