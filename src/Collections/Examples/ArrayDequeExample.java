package Collections.Examples;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.add("First");
        deque.addLast("Second");
        deque.addFirst("Zero");

        System.out.println("Deque: " + deque);

        deque.removeLast();
        deque.removeFirst();

        System.out.println("Deque after removals: " + deque);
    }
}

