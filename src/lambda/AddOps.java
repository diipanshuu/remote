package lambda;

import java.util.concurrent.Callable;

public class AddOps implements MathOperation, Callable<Integer> {

    int a = 5;
    int b = 2;
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }

    @Override
    public Integer call() throws Exception {
        return calculate(a, b);
    }
}
