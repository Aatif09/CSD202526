package Collections.Examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Orange", 2);

        System.out.println("HashMap: " + map);
        System.out.println("Value for 'Apple': " + map.get("Apple"));

        map.remove("Banana");
        System.out.println("After removal: " + map);


        Set<String> strings = map.keySet();
        for(String i:strings){
            System.out.println(map.get(i));
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> i:entries){
            System.out.println(i.getKey()+i.getValue());

        }
    }
}

