package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Deque_JCF {
    public static void main(String[] args) {
        /*
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1);
        deque.addLast(2);
        System.out.println("After adding elements: " + deque);

        deque.removeFirst();
        deque.removeLast();
        System.out.println("After removing elements: " + deque);

        deque.addFirst(3);
        deque.addLast(4);
        System.out.println("After adding more elements: " + deque);

        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());

        System.out.println("Peeking first element: " + deque.peekFirst());
        System.out.println("Peeking last element: " + deque.peekLast());

        deque.offerFirst(5);
        deque.offerLast(6);
        System.out.println("After offering elements: " + deque);

        deque.pollFirst();
        deque.pollLast();
        System.out.println("After polling elements: " + deque);

        System.out.println("Deque size: " + deque.size());
        System.out.println("Is deque empty? " + deque.isEmpty());
        */

        // More complete and consistent LIFO implementation of Stack class
        // Using ArrayDeque

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
    }
}
