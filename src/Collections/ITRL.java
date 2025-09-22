package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ITRL {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
//        for (String s : items) {
//            if ("A".equals(s)) {
//                items.remove(s);
//            }
//        }

        for (int i = 0; i < items.size(); i++) {
            if ("A".equals(items.get(i))) {
                items.remove(i);
                i--;
            }
        }

        Iterator<String> iterator = items.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if ("B".equals(s)) {
                iterator.remove();
            }
        }
    }
}

