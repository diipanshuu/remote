package collections;

import java.util.*;

public class List_JCF {
    public static void main(String[] args) {
        /*
        List<String> groups = new ArrayList<>();
        groups.add("1");
        groups.add("2");
        groups.add("3");

        groups.add(1, "0");
        System.out.println("Element at index 1 is: " + groups.get(1));
        groups.set(3, "4");
        System.out.println("Element at index 3 is set to: " + groups.get(3));
        groups.remove(0);
        boolean isRemoved = groups.remove("5");
        System.out.println(isRemoved);

        System.out.println(groups);
        */

        // LinkedList

        /*
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);

        // Inserting at specific position
        list.add(2, 3);

        System.out.println("Element at index 3 is: " + list.get(3));

        System.out.println(list);
        */

        // Vector implementation...

        List<String> vector = new Vector<>(10);

        // Time complexity: Amortized O(1) for adding elements at the end.
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Time complexity: O(n) for adding an element at a specific index.
        vector.add(1, "Blueberry");

        // Time complexity: O(n) for removing an element.
        vector.remove("Banana");
        vector.remove(1);

        // Time complexity: O(1) for getting an element by index.
        String fruit = vector.get(0);

        // Time complexity: O(1) for setting an element at a specific index.
        vector.set(0, "Avocado");

        // Time complexity: O(1) for size().
        int size = vector.size();

        // Time complexity: O(1) for isEmpty().
        boolean isEmpty = vector.isEmpty();

        // Time complexity: O(n) for contains().
        boolean containsApple = vector.contains("Apple");
        boolean containsAvocado = vector.contains("Avocado");

        System.out.println(vector);

    }

}
