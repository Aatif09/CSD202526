package Collectprac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A8 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(100);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println(list);

        Collections.sort(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        int index = Collections.binarySearch(list, 11);
        System.out.println(index);
        List<String> names = Arrays.asList("A", "B", "A", "C", "A");
        int count = Collections.frequency(names, "A");
        System.out.println(count);

        List<Integer> cards = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.shuffle(cards);
        System.out.println(cards); // random order

        List<String> list33 = new ArrayList<>(Arrays.asList("A", "B", "A"));
        Collections.fill(list33, "Z");
        System.out.println(list33); // [Z, Z, Z]
        List<Integer> nums = Arrays.asList(10, 20, 5, 7);
        System.out.println(Collections.min(nums)); // 5
        System.out.println(Collections.max(nums)); // 20

        List<Integer> numss = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Original: " + numss);
        Collections.rotate(numss, 2);
        System.out.println("After rotate(2): " + numss);
        Collections.rotate(numss, -1);
        System.out.println("After rotate(-1): " + numss);

    }
}
