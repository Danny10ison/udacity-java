package phase_one.lesson_7.queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExercise {
    public static void main(String[] args) {
        Queue<String> queuedCustomers = new LinkedList<>();

        queuedCustomers.add("1234"); // customer 1234 takes a number
        queuedCustomers.add("5678"); // customer 3412 takes a number
        queuedCustomers.add("9101112"); // customer 0123 takes a number
        queuedCustomers.add("13141516"); // customer 4321 takes a number

        while (!queuedCustomers.isEmpty()) {
            System.out.println("Customer " + queuedCustomers.poll() + " is getting helped");
        }
    }
}
