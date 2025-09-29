package Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Link {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        //((LinkedList<String>) fruits).addFirst("Mango");
        fruits.addFirst("Mango");
        fruits.addLast("Berry");

        System.out.println("LinkedList: " + fruits.get(0));
        Collections.sort(fruits);
        System.out.println("LinkedList: " + fruits);

    }
}