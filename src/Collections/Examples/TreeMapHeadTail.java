package Collections.Examples;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapHeadTail {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1000, "A");
        treeMap.put(2000, "B");
        treeMap.put(3000, "C");
        treeMap.put(4000, "D");

        // Get all keys less than 3000
        Map<Integer, String> lessThan3000 = treeMap.headMap(3000);
        System.out.println("Keys less than 3000: " + lessThan3000);

        // Get all keys greater than or equal to 3000
        Map<Integer, String> greaterOrEqual3000 = treeMap.tailMap(3000);
        System.out.println("Keys >= 3000: " + greaterOrEqual3000);

        // Get keys between 2000 and 4000 (exclusive of 4000)
        Map<Integer, String> between2000And4000 = treeMap.subMap(2000, 4000);
        System.out.println("Keys between 2000 and 4000: " + between2000And4000);
    }
}
