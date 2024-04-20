package synchronization.producer_consumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public int maxShelfs;
    private List<Object> items;

    Store(int maxShelfs) {
        this.maxShelfs = maxShelfs;
        items = new ArrayList<>();
    }

    public int getMaxShelfs(){
        return maxShelfs;
    }

    public List<Object> getItems(){
        return items;
    }

    public void addItem(){

        this.items.add(new Object());
        System.out.println("Producer size is: " + this.items.size());
    }

    public void removeItem(){

        this.items.remove(this.items.size() - 1);
        System.out.println("Consumer size is: " + this.items.size());
    }
}
