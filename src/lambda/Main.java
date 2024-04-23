package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        * Traditional implementation
        AddOps addOps = new AddOps();
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> future = executorService.submit(addOps);
        System.out.println(future.get());
        */

        /*
        * Lambda Implementation using callable
        int a = 5;
        int b = 2;
        Callable<Integer> callable = () -> {
            return a + b;
        };

        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> future = executorService.submit(callable);
        System.out.println(future.get());
        */

        /*
        * Using Lambda Expression just writing the execution logic
        * inside the run();
        Thread thread = new Thread(() -> {
            System.out.println("Printing using Lambda Expression.");
            System.out.println(Thread.currentThread().getName());
        });
        thread.start();
        */

        // sortMethod();
        mathOperations();
    }

    public static void sortMethod(){
        List<Integer> list = Arrays.asList(9, 8, 6, 5, 4 , 3, 2);

        list.sort((i1, i2) -> {
            return i1 - i2;
        });

        System.out.println(list);
    }

    public static void mathOperations(){
        MathOperation add = (a, b) -> {
            return a + b;
        };

        MathOperation sub = (a, b) -> {
            return a - b;
        };

        printResult(1, 2, add);
    }

    public static void printResult(int a, int b, MathOperation anyOperation){
        System.out.println(anyOperation.calculate(a, b));
    }
}
