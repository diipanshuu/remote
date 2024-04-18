package synchronization.mutex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Lock l = new ReentrantLock();
        System.out.println("Initial value: " + v.val);
        Adder a = new Adder(v, l);
        Subtractor s = new Subtractor(v, l);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> add = es.submit(a);
        Future<Void> sub = es.submit(s);

        add.get();
        sub.get();

        System.out.println("Changed value: " + v.val);
    }
}
