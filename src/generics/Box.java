package generics;
// Generic Types
public class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Namaste ji!");
        System.out.println("String Box: " + stringBox.getContent());

        Box<Integer> intBox = new Box<>();
        intBox.setContent(41);
        System.out.println("Integer Box: " + intBox.getContent());
    }
}
