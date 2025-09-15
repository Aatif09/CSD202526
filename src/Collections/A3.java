package Collectprac;

import java.util.ArrayList;

public class A3 {

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.ensureCapacity(5);
        arr.trimToSize();
        arr.add(10);

        for (int i:arr){
            System.out.println(i);
        }
    }
}

