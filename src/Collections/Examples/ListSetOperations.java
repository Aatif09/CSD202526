package Collections.Examples;

import java.util.*;
public class ListSetOperations {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

        Set<Integer> set1 = new LinkedHashSet<>(list1);
        Set<Integer> set2 = new LinkedHashSet<>(list2);


        Set<Integer> union = new LinkedHashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        Set<Integer> intersection = new LinkedHashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        Set<Integer> difference = new LinkedHashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference (list1 - list2): " + difference);
    }
}

