package Collections.Examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAdvanced {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple"); // duplicate for index testing
        list.add("Mango");
        list.add("Guava");

        // indexOf and lastIndexOf
        System.out.println("First index of 'Apple': " + list.indexOf("Apple"));
        System.out.println("Last index of 'Apple': " + list.lastIndexOf("Apple"));

        // subList - view from index 1 to 3 (excluding 3)
        List<String> subList = list.subList(1, 4);
        System.out.println("Sublist (1 to 3): " + subList);

        // clone - creates a shallow copy
        ArrayList<String> clonedList = (ArrayList<String>) list.clone();
        System.out.println("Cloned list: " + clonedList);

        // Convert to array
        String[] array = list.toArray(new String[0]);
        System.out.println("Array[0]: " + array[0]);

        // ensureCapacity & trimToSize
        list.ensureCapacity(100); // optimize memory usage when adding many elements
        list.trimToSize();        // shrink to current size

        // Iterating using for-each
        for (String fruit : list) {
            System.out.println("Fruit: " + fruit);
        }

        // Synchronized version for thread-safe use
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());
        syncList.add("ThreadSafe");
        System.out.println("Synchronized List: " + syncList);
    }
}
