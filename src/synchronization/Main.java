package synchronization;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Value v = new Value(0);
        System.out.println("Initial value: " + v.val);

        Adder x = new Adder(v);
        Subtractor s = new Subtractor(v);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> addedFuture = es.submit(x);
        Future<Void> subtradctedFuture = es.submit(s);

        addedFuture.get();
        subtradctedFuture.get();

        System.out.println("Final value: " + v.val);
    }
}

