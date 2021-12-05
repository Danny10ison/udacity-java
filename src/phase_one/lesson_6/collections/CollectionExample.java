package phase_one.lesson_6.collections;

import java.util.LinkedList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<String> listOfItems = new LinkedList<String>();
        listOfItems.add("Mike");
        listOfItems.add("Bob");
        listOfItems.add("Alice");

        for (String name : listOfItems) {
            System.out.println(name);
        }
    }
}
