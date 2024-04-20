package synchronization.producer_consumer;

public class Producer implements Runnable{

    private Store store;

    Producer(Store st){
        this.store = st;
    }

    @Override
    public void run(){
        while(true){
            synchronized (store){
                if(store.getItems().size() < store.getMaxShelfs()){
                    store.addItem();
                    store.notify();
                }else {
                    try {
                        store.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
