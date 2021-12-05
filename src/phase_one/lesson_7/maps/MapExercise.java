package phase_one.lesson_7.maps;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main(String[] args) {
        Map<String, Person> mapOfPeople = new HashMap<String, Person>();
        Person mike = new Person("Mike", "mike@email.com");
        Person shaun = new Person("Shaun", "shaun@email.com");
        Person sally = new Person("Sally", "sally@email.com");
        Person cesar = new Person("Cesar", "cesar@email.com");

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(mike);
        people.add(shaun);
        people.add(sally);
        people.add(cesar);

        for(Person person : people){
            mapOfPeople.put(person.getEmail(), person);
        }

//        for (String email : mapOfPeople.keySet()) {
//            System.out.println(email);
//        }
//
//        for (Person person : mapOfPeople.values()) {
//            System.out.println(person);
//        }

        System.out.println("Get Mike: " + mapOfPeople.get("mike@email.com"));
        System.out.println("Get Jeff: " + mapOfPeople.get("jeff@email.com"));
        System.out.println("Contains Mike: " + mapOfPeople.containsKey("mike@email.com"));
        System.out.println("Contains Jeff: " + mapOfPeople.containsKey("jeff@email.com"));

    }

}
