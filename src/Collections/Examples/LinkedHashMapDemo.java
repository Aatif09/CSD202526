package Collections.Examples;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("Red", 1);
        map.put("Green", 2);
        map.put("Blue", 3);

        System.out.println("LinkedHashMap (insertion order): " + map);
    }
}

