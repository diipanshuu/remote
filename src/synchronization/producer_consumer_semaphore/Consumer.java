package synchronization.producer_consumer_semaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Store store;
    private Semaphore pSema, cSema;
    Consumer(Store st, Semaphore pSema, Semaphore cSema){
        this.store = st;
        this.pSema = pSema;
        this.cSema = cSema;
    }

    @Override
    public void run() {
        while (true) {
            try{
                this.cSema.acquire();
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.removeItem();
            this.pSema.release();
        }
    }
}
