package Collections;

import java.util.*;

class IntegerComp implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2)
    {
        return o1-o2;
    }
}
public class A9 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(40);
        Collections.sort(list);
        list.sort(null);
//        list.sort(Comparator.naturalOrder());
//        list.sort(Comparator.reverseOrder());

//        list.sort(new IntegerComp());

//        list.sort((a, b) -> a - b);

        System.out.println(list);
    }
}
// Comparator.compare(o1,o2):
//Return a negative number → if o1 < o2 (so o1 comes before o2)
//Return zero → if o1 == o2 (treated as equal in ordering)
// Return a positive number → if o1 > o2 (so o1 comes after o2)

//20 vs 10 → swap (since positive)
//20 vs 30 → no swap (since negative)
//10 vs 20 → no swap (since negative)