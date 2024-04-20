package generics;

public class UpperBounds<T extends Number>{
    private T number;

    public void setNumber(T number){
        this.number = number;
    }

    public T getNumber(){
        return number;
    }

    public static void main(String[] args) {
        UpperBounds<Integer> intExample = new UpperBounds<>();
        intExample.setNumber(41);
        System.out.println("Integer Example: " + intExample.getNumber());

        UpperBounds<Double> doubleExample = new UpperBounds<>();
        doubleExample.setNumber(3.14);
        System.out.println("Double Example: " + doubleExample.getNumber());
    }
}
