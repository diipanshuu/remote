package synchronization.mutex;

public class Value {
    public int val = 0;

    synchronized public void increment(int i){
        this.val += 1;
        System.out.println("Lock acquired by adder id: " + i + " ThreadName " + Thread.currentThread().getName());
    }

    synchronized public void decrement(int i){
        this.val -= 1;
        System.out.println("Lock acquired by subtractor id: " + i + " ThreadName " + Thread.currentThread().getName());
    }
}
