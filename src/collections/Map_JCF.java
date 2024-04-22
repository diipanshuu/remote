package collections;

import java.util.*;

public class Map_JCF {

    public static void main(String[] args) {

        /*
        Map<String, Integer> map = new HashMap<>();

        // put method
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // get method
        Integer value1 = map.get("one");
        Integer value2 = map.get("two");
        Integer value3 = map.get("three");

        // remove method
        map.remove("one");

        // containsKey method
        boolean hasTwo = map.containsKey("two");
        boolean hasOne = map.containsKey("one");

        // containsValue method
        boolean hasValue2 = map.containsValue(2);
        boolean hasValue1 = map.containsValue(1);

        int size = map.size();

        boolean isEmpty = map.isEmpty();

        for(String str : map.keySet()){
            System.out.println(map.get(str));
        }
        */

        /*
        // LinkedHashMap Implementation
        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        map.get(1);
        map.get(2);
        map.get(3);

        // ContainsKey operation
        System.out.println(map.containsKey(2));
        System.out.println(map.containsKey(5));

        // ContainsValue operation
        map.containsValue("three");
        map.containsValue("five");

        // Remove operation
        map.remove(1);
        map.remove(3);

        // Size operation
        map.size();


        // Iterate over values
        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println(map);
        */

        /*
        // TreeMap Implementation

        Map<Integer, String> treeMap = new TreeMap<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            treeMap.put(i, "Value " + i);
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken to add elements: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            treeMap.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to retrieve elements: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            treeMap.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to remove elements: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            entry.getKey();
            entry.getValue();
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to iterate over elements: " + (endTime - startTime) + " ns");
        */

        // HashTable implementation
        Map<String, Integer> map = new Hashtable<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        Integer value1 = map.get("one");
        Integer value2 = map.get("two");
        Integer value3 = map.get("three");

        map.remove("one");

        boolean hasTwo = map.containsKey("two");
        boolean hasOne = map.containsKey("one");

        boolean hasValue2 = map.containsValue(2);
        boolean hasValue1 = map.containsValue(1);

        int size = map.size();

        boolean isEmpty = map.isEmpty();

        for(String str : map.keySet()){
            System.out.println(map.get(str));
        }
    }

}
