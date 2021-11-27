package phase_one.lesson_4.inheritance;

public class Person {
    private String firstName;
    private String lasName;

    public Person(String firstName, String lasName) {
        super();
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
