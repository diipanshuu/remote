package intro_to_threads;

public class Numbers implements Runnable{
    int n;

    Numbers(int num){
        this.n = num;
    }
    public void run(){
        System.out.println("The number is : " + this.n + " " + Thread.currentThread().getName());
    }
}
