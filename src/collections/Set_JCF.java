package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_JCF {
    public static void main(String[] args) {
        /*
        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        hashSet.remove(2);

        boolean contains = hashSet.contains(1);

        int size = hashSet.size();

        for (Integer element : hashSet) {
            System.out.println(element);
        }

        System.out.println(contains + " : Contains element and the resultant hashSet is : " + hashSet);
         */

        // LinkedHashSet implementation

        /*
        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        set.remove(2);

        boolean contains = set.contains(1);

        int size = set.size();

        for (Integer element : set) {
            System.out.println(element);
        }
        */

        // TreeSet implementation
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(7);
        treeSet.add(1);

        int size = treeSet.size();

        boolean containsFive = treeSet.contains(5);
        boolean containsTwo = treeSet.contains(2);

        for (Integer value : treeSet) {
            // O(1) for each element since iteration is in sorted order
            System.out.println(value);
        }

        treeSet.remove(3);

        Integer first = ((TreeSet<Integer>) treeSet).first();

        // Finding the last element
        Integer last = treeSet.last();

        System.out.println(treeSet);

        // Finding the higher element
        Integer higher = treeSet.higher(5);
        System.out.println("higher: " + higher);

        // Finding the lower element
        Integer lower = treeSet.lower(5);
        System.out.println("lower: " + lower);

    }
}
