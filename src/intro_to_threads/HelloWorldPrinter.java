package intro_to_threads;

public class HelloWorldPrinter implements Runnable{

    public void doSomething(){
        System.out.println("doSomething thread: " + Thread.currentThread().getName());
    }
    @Override
    public void run() {
        System.out.println("Hello world from: " + Thread.currentThread().getName());
        doSomething();
    }
}
