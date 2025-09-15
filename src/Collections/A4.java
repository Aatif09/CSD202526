package Collectprac;
import java.util.ArrayList;
import java.util.Collections;

public class A4{
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(10);
        list.add("Shubham");
        list.add(true);
        list.add(10);
        list.add(12.5);
        list.add(10);
        System.out.println(list);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i)+" ");
//        }
        for (Object i:list){
            System.out.print(i + " ");
        }
        Collections.sort(list);
    }
}
