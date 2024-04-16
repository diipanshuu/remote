package modifiers_1;

import java.sql.SQLOutput;

public class Student2 {
    public static void main(String[] args) {
        Student s0 = new Student(3, "Rahul");
//        System.out.println("s0 " + s0.name.hashCode());
        System.out.println("s0 " + System.identityHashCode(s0.name));
        System.out.println(("s0-m " + s0.m.hashCode()));
//        s0.setAge(13);
//
//        System.out.println(s0.getAge());

//        System.out.println(s0.getAge());
//        System.out.println(s0.rollNo);
//        System.out.println(s0.name);

        Student s2 = new Student(s0);
//        System.out.println("s2 " + s2.name.hashCode());
        System.out.println("s2 " + System.identityHashCode(s2.name));
        System.out.println(("s2-m " + s2.m.hashCode()));
//        System.out.println("s0 " + s0.getAge());
//        System.out.println("s0 " + s0.rollNo);
//        System.out.println("s0 " + s0.name);
//        System.out.println("s2 " + s2.getAge());
//        System.out.println("s2 " + s2.rollNo);
//        System.out.println("s2 " + s2.name);
//        System.out.println("_____");
//        s2.setAge(6);
//        s2.rollNo = 4;
//        s2.name = "Rupesh";
//        System.out.println("_____");
//        System.out.println("s2 " + s2.getAge());
//        System.out.println("s2 " + s2.rollNo);
//        System.out.println("s2 " + s2.name);
//        System.out.println("_____");
//        System.out.println("s0 " + s0.getAge());
//        System.out.println("s0 " + s0.rollNo);
//        System.out.println("s0 " + s0.name);
        s0.m.rollNo = 1;
        System.out.println("s0-m " + s0.m.rollNo);
        System.out.println("s2-m " + s2.m.rollNo);
        s2.m.rollNo = 2;
        System.out.println("s0-m " + s0.m.rollNo);
        System.out.println("s2-m " + s2.m.rollNo);
    }
}
