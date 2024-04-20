package generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardsUL {
    public static void printList(List<?> list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Namaste ji!");
        stringList.add("How you doing?");

        List<Integer> intList = new ArrayList<>();
        intList.add(41);
        intList.add(100);

        printList(stringList);
        printList(intList);
    }
}
