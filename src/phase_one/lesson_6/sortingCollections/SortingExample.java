package phase_one.lesson_6.sortingCollections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingExample {

    public static void main(String[] args) {
        List<String> names = new LinkedList<String>();

        names.add("Mike");
        names.add("Bob");
        names.add("Alice");

        System.out.println("Before sort");
        //Before  Sorting
        for (String name : names) {
            System.out.println(name);
        }

        //sorting
        Collections.sort(names);
        System.out.println("\nAfter sort");
        //after sorting
        for (String name : names) {
            System.out.println(name);
        }
    }
}
