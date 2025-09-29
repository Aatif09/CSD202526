package Collections.Examples;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("Head of queue: " + pq.peek()); // smallest element
        System.out.println("Removed head: " + pq.poll());

        System.out.println("Queue after poll: " + pq);
    }
}
