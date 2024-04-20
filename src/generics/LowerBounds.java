package generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBounds {
    public static void printNumbers(List<? super Integer> numbers) {
        for(Object num : numbers) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        numbers.add(41);
        numbers.add(3.14);
        printNumbers(numbers);

        List<Object> objects = new ArrayList<>();
        objects.add(100);
        objects.add("Not a number");
        printNumbers(objects);
    }
}
