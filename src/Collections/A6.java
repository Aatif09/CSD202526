package Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A6{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(100);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println(list);

        List<String> list1 = Arrays.asList("M", "T");
        System.out.println(list1.getClass());
        list1.set(0,"S");
        System.out.println(list1);

    }
}


