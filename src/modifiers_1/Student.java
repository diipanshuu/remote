package modifiers_1;

public class Student {
    protected int age = 5;
    int rollNo;
    public String name;

    Monitor m;

    public Student (int rollNo, String name){
        this.rollNo = rollNo;
        this.name = new String(name);
        this.m = new Monitor();
    }

//    Copy constructor
    Student(Student other){
        setAge(other.getAge());
        this.rollNo = other.rollNo;
        this.name = new String(other.name);
        this.m = new Monitor(other.m.rollNo);
    }

    void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

}
