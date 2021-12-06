package javaBestPractices;

public class AvoidLoopsWithIndexes {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Carol", "David", "Eric", "Frank"};

        for (int i = 0; i < names.length; i++) {
            doSomething(names[i]);
        }

        for (String aName : names) {
            doSomething(aName);
        }
    }
}
