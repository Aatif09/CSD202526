package Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Student10   {
    int id;
    String name;
    Student10(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return id + "-" + name;
    }
}
public class A12 {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(30);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);


        List<Student10> list2 = new ArrayList<>();
        list2.add(new Student10(20, "AJ"));
        list2.add(new Student10(10, "ZJ"));
        list2.add(new Student10(30, "CJ"));
        System.out.println(list2);
       //Collections.sort(list2);
        System.out.println(list2);

    }

}
