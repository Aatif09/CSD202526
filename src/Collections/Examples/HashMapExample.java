package Collections.Examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 1500);
        hashMap.put(2, 3200);
        hashMap.put(3, 2800);
        hashMap.put(4, 4000);

        System.out.println("Values less than 3000 in HashMap:");
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() < 3000) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }
    }
}

