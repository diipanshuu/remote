package synchronization.producer_consumer_semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();

        Store s = new Store(5);
        Semaphore pSema = new Semaphore(5);
        Semaphore cSema = new Semaphore(0);

        for (int i = 0; i < 8; i++) {
            es.execute(new Producer(s, pSema, cSema));
        }

        for (int i = 0; i < 20; i++) {
            es.execute(new Consumer(s, pSema, cSema));
        }
    }
}
