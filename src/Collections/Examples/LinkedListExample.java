package Collections.Examples;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.addFirst(5); // adds at head
        numbers.addLast(20); // adds at tail

        System.out.println("First Element: " + numbers.getFirst());
        System.out.println("Last Element: " + numbers.getLast());

        numbers.removeFirst();
        numbers.removeLast();

        System.out.println("Updated List: " + numbers);
    }
}

