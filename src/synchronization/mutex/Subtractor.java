package synchronization.mutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value v;
    private Lock l;
    Subtractor(Value v, Lock l){
        this.v = v;
        this.l = l;
    }
    @Override
    public Void call() throws Exception {

        for(int i = 0; i < 100000; i++){

//            synchronized (v) {
//                System.out.println("Lock acquired by subtractor id: " + i + " ThreadName " + Thread.currentThread().getName());
//                this.v.val -= 1;
//            }
            this.v.decrement(i);

        }
        return null;
    }
}
