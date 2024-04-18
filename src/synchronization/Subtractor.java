package synchronization;

import java.util.concurrent.Callable;

public class Subtractor implements Runnable {
    public Value v;

    Subtractor(Value v){
        this.v = v;
    }
    @Override
    public void run() {
        for(int i = 0; i < 100000; i++){
            this.v.val -= 2;
        }
    }
}
