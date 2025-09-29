package Collections;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(20);

        System.out.println("TreeSet (sorted): " + set);
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
    }
}

