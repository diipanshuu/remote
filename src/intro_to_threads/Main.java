package intro_to_threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        /*
        HelloWorldPrinter hw = new HelloWorldPrinter();
//        hw.run();
        Thread t = new Thread(hw);
        t.start();
        System.out.println("Current Thread in Main class: " + Thread.currentThread().getName());
         */

        // Creating 100 threads
//        for(int i = 0; i <= 10000000; i++){
//            Numbers obj = new Numbers(i);
//            Thread t = new Thread(obj);
//            t.start();
//        }

        //Now using Executor
//        ExecutorService es = Executors.newFixedThreadPool(200000);
        Executor es = Executors.newCachedThreadPool();
        for(int i = 0; i <= 1000000; i++){
            Numbers obj = new Numbers(i);
            es.execute(obj);
        }
    }
}
