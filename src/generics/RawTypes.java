package generics;

import java.util.*;

public class RawTypes {
    public static void main(String[] args) {
        // Raw Type usage
        List rawList = new ArrayList();
        rawList.add("Hello");
        rawList.add(41);

        // Proper usage with generics
        List<String> stringList = new ArrayList<String>();
        stringList.add("Hello");
//        stringList.add(41); // Compile time type safety
    }
}
