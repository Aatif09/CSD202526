package Collections.Examples;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Add elements
        set.add("Dog");
        set.add("Cat");
        set.add("Bird");
        set.add("Dog"); // duplicate ignored

        System.out.println("HashSet: " + set);

        // Check if element exists
        System.out.println("Contains 'Cat'? " + set.contains("Cat"));
        System.out.println("Contains 'Tiger'? " + set.contains("Tiger"));

        // Remove an element
        set.remove("Bird");
        System.out.println("After removing 'Bird': " + set);

        // Size of the set
        System.out.println("Size: " + set.size());

        // Iterate using for-each
        System.out.println("Iterating with for-each:");
        for (String animal : set) {
            System.out.println(animal);
        }

        // Iterate using Iterator
        System.out.println("Iterating with Iterator:");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // isEmpty
        System.out.println("Is empty? " + set.isEmpty());

        // Clone the set
        HashSet<String> clonedSet = (HashSet<String>) set.clone();
        System.out.println("Cloned set: " + clonedSet);

        // Clear the set
        set.clear();
        System.out.println("After clear: " + set);
    }
}
