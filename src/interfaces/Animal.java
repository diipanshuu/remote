package interfaces;

public class Animal implements Aggressive{
    int age;
    private int id;
    String name;

    Animal(int age, int id, String name){
        this.age = age;
        setID(id);
        this.name = name;
    }

    public int getID(){
        return this.id;
    }

    public void setID(int id){
        this.id = id;
    }

    public boolean isAgr(){
        return this.age > 9;
    }
}
