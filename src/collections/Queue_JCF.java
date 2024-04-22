package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_JCF {

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(15);
        System.out.println("Queue " + queue);
        System.out.println("peek() " + queue.peek());
        System.out.println("poll() " + queue.poll());

        System.out.println("remove() " + queue.remove(15));
        System.out.println("contains() " + queue.contains(20) + " size() " +
        queue.size());

    }
}
