package phase_one.lesson_6.sortingCollections;

import java.util.*;

class Person implements Comparable<Person> {
    public String name;
    public Person(String name) {
        this.name = name;
    }
    public int compareTo(Person person) {
        return name.compareTo(person.name);

    }
}

public class PersonSort {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Same"));
        people.add(new Person("Mike"));
        people.add(new Person("Apple"));

        Collections.sort(people);
        for (Person person : people) {
            System.out.println(person.name);
        }
    }
}
