package Collections.Examples;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Banana", 3);
        map.put("Apple", 1);
        map.put("Cherry", 2);

        System.out.println("TreeMap (sorted by keys): " + map);

        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());
    }
}

