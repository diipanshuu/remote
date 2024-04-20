package generics;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>();
        p.setX("10");
        p.setY(10);
        Pair.doSomething("abc", 10);

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(11, "val");
        hm.put(10, "val");

        //Raw data Types
        Pair p1 = new Pair();
        p1.setY("abc");
        p1.setY(01);

        System.out.println(p1.getY());

        System.out.println("Debug...");
    }
}
