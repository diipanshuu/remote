package generics;

public class Pair <V, S>{
    V x;
    S y;

    public void setX(V x){
        this.x = x;
    }

    public void setY(S y){
        this.y = y;
    }

    public S getY(){
        return y;
    }

    public static <v, s> void doSomething(v x, s y){
        System.out.println("Hey!");
    }
}
