package phase_one.lesson_3.workingWithObjects;

public class Person {

    private String firstName;
    private String lasName;

    public Person(String firstName, String lasName) {
        this.firstName = firstName;
        this.lasName = lasName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    @Override
    public String toString() {
        return "Name:" + firstName + " " + lasName;
    }
}
