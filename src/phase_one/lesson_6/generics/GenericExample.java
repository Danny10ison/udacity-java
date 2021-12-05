package phase_one.lesson_6.generics;

import java.util.ArrayList;

public class GenericExample {
    public static void main(String[] args) {
        ArrayList<Object> variables = new ArrayList<Object>();

        Double doubleNumber = 1.5;
        String name = "Sally";
        int intNumber = 1;
        char letter = 'a';

        variables.add(doubleNumber);
        variables.add(name);
        variables.add(intNumber);
        variables.add(letter);

        for (Object variable : variables) {
            GenericExample.displayClassName(variable);
        }

    }

    // Java type ensure
    static <T> void displayClassName(T variable){
        System.out.println(variable.getClass().getName());
    }
}
