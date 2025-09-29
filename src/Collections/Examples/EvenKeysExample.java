package Collections.Examples;

import java.util.Map;
import java.util.TreeMap;

public class EvenKeysExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1000, "A");
        treeMap.put(1501, "B");
        treeMap.put(2000, "C");
        treeMap.put(3003, "D");
        treeMap.put(4000, "E");

        System.out.println("Entries with even keys:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            if (entry.getKey() % 2 == 0) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}
