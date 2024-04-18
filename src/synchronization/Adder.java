package synchronization;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value v;
    Adder(Value v){
        this.v = v;
    }

    @Override
    public Void call(){
        for(int i = 0; i < 100000; i++){
            this.v.val += 1;
        }
        return null;
    }
}
