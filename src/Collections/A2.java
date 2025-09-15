package Collectprac;

import java.util.ArrayList;

public class A2 {

    public static void main(String[] args) {
        ArrayList arr=new ArrayList();
        arr.ensureCapacity(5);
        arr.trimToSize();
        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add("Huakk");
        arr.add(true);
        arr.add(12.4);
        System.out.println(arr.get(3));
        arr.set(0,11);
        ArrayList art=(ArrayList) arr.clone();
        System.out.println(art);
        System.out.println(arr);

//        for (Object i:arr){
//            System.out.println(i);
//        }
//        arr.remove(Integer.valueOf(10));
//        for (Object i:arr){
//            System.out.println(i);
//        }
    }
}
