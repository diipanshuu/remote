package synchronization;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    public Value v;

    Subtractor(Value v){
        this.v = v;
    }
    @Override
    public Void call() {
        for(int i = 0; i < 100000; i++){
            this.v.val -= 2;
        }
        return null;
    }
}
