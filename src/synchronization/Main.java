package synchronization;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Value v = new Value(0);
        System.out.println("Initial value: " + v.val);

        Adder x = new Adder(v);
        Subtractor s = new Subtractor(v);

        Thread t1 = new Thread(x);
        Thread t2 = new Thread(s);

        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("Final value: " + v.val);
    }
}

