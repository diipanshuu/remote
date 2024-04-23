package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // System.out.println(test().size());
        example7();
    }

    public static void example1(){
        List<Integer> list = Arrays.asList(1, 3, 5, 2, 4, 6);

        Stream<Integer> stream1 = list.stream();
        stream1.forEach((ele) -> System.out.println(ele));
    }

    public static void example2(){
        List<Integer> list = Arrays.asList(1, 3, 5, 2, 4, 6);
        Stream<Integer> stream = list.stream();
        stream.forEach((ele) -> System.out.println(ele * ele));
    }

    public static void example3(){
        List<Integer> list = Arrays.asList(1, 3, 5, 2, 4, 6);
        Stream<Integer> stream = list.stream();
        stream.map((ele) -> ele * ele)
                .forEach((ele) -> System.out.print(ele + " "));
    }

    public static void example4(){
        List<Integer> list = Arrays.asList(1, 3, 5, 2, 4, 6);
        Stream<Integer> stream = list.stream();
        stream.filter((ele) -> ele % 2 == 0)
                .map((ele) -> ele * ele)
                .forEach((ele) -> System.out.print(ele + " "));

        System.out.println();
        System.out.println("Original list: " + list);

        // Stream has already been operated
        // stream.forEach((ele) -> System.out.println(ele));

    }

    public static void example5(){
        List<Integer> list = Arrays.asList(1, 3, 5, 2, 4, 6);
        Stream<Integer> stream = list.stream();
        /*
        * Local variable should be Final OR
        * Effectively final
        int sum = 0;
        stream.forEach((ele) -> {
            sum += ele;
        });
        System.out.println(sum);
         */

        System.out.println(stream.reduce(0,
                (sum, ele) -> {return sum += ele;
        }));
    }

    public static void example6(){
        List<Integer> list = Arrays.asList(1, 3, 5, 2, 4, 6);
        List<Integer> sortedList =
                list.stream()
                        .map((ele) -> ele * ele)
                        .filter((ele) -> ele % 2 != 0)
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println(sortedList);
    }

    public static void example7(){
        List<Integer> list = Arrays.asList(2, 3, 5, 2, 4, 6);

        Optional<Integer> i = list.stream()
                .map((ele) ->
                {
                    System.out.println("Calling map " + ele);
                    return ele * ele;
                })
                .findFirst();

        System.out.println(i);

        /*
        * Parallel stream starts new threads and do execution on diff threads
        * list.parallelStream().forEach((ele) -> System.out.println(Thread.currentThread().getName()));
        */
    }

    public static List<Integer> test(){
        return Arrays.asList(1, 3, 5, 2, 4, 6);
    }
}
