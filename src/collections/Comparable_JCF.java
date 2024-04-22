package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_JCF {
    private static class Person implements Comparable<Person> {
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

        @Override
        public int compareTo(Person other) {
            return Integer.compare(this.age, other.age);
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        System.out.println("Before sorting:");
        for (Person person : people) {
            System.out.println(person);
        }

        Collections.sort(people);

        System.out.println("\nAfter sorting:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
