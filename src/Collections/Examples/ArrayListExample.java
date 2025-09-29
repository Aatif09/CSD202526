package Collections.Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AAAA{
    public static void main(String[] args) {

       List aa= Arrays.asList("A",2,3,4,4);
        System.out.println(aa);
        aa.set(1,2323);
        System.out.println(aa);}
}

class ArrayListExample2{
    public static void main(String[] args) {
        List arr= new ArrayList();
        arr.add(222);
        arr.add(333);
        ArrayList ar= new ArrayList();
        ar.add(11);
        ar.add(1,12);
        ar.add("AAA");
        ar.add(true);
        ar.addAll(arr);
//        for (int i = 0; i <ar.size() ; i++) {
//            System.out.println(ar.get(i));
//
//        }
        for (Object i : ar){
            System.out.println(i);
            ar.set(1,4444);
        }
        System.out.println(ar);
        List ar1=new ArrayList();
    }
}
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        list.add(1, "Blueberry"); // insert at index

        list.remove("Banana"); // remove element

        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("All elements: " + list);

        list.set(0, "Apricot"); // update element

        System.out.println("Contains 'Cherry'? " + list.contains("Cherry"));
        System.out.println("Size: " + list.size());

        list.clear(); // remove all
        System.out.println("Empty? " + list.isEmpty());
    }
}

