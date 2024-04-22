package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_JCF {
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

    }

    static class AgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    }
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        System.out.println("Before sorting:");
        for (Person person : people) {
            System.out.println(person.getAge() + " " + person.getName());
        }

        Comparator<Person> ageComparator = new AgeComparator();

        Collections.sort(people, ageComparator);

        System.out.println("\nAfter sorting by age:");
        for (Person person : people) {
            System.out.println(person.getAge() + " " + person.getName());
        }
    }

}
