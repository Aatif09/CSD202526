package Collections;

import java.util.*;

public class ITR {
    public static void main(String[] args) {
        List l =new ArrayList<>();
        l.add(10);
        l.add("Aatif");
        l.add(12.3);

        Iterator itr= l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        ListIterator  litr = l.listIterator();

        System.out.println("Forward iteration:");
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }
        System.out.println("\nBackward iteration:");
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }

        Stack  list = new Stack();
        list.add(1111);
        list.add("ass");
        Enumeration emu=list.elements();
        while(emu.hasMoreElements()){
            System.out.println(emu.nextElement());
        }

    }
}

