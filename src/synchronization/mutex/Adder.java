package synchronization.mutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value v;
    private Lock l;
    Adder(Value v, Lock l){
        this.v = v;
        this.l = l;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 0; i < 100000; i++){

//            synchronized (v) {
//                System.out.println("Lock acquired by adder id: " + i + " ThreadName " + Thread.currentThread().getName());
//                this.v.val += 1;
//            }
            this.v.increment(i);

        }
        return null;
    }
}
