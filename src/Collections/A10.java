package Collections;

import java.util.*;

class StringComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }

}
public class A10 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("banana", "apple", "date");
        words.sort(new StringComp());
//        list.sort((a, b) -> b - a);

        System.out.println(words);
    }
}
