package phase_one.lesson_4.abstractClasses;

public abstract class Vehicle {
    protected String start;
    protected String stop;
    protected String direction;

    public Vehicle(String start, String stop,
                   String direction) {
        this.start = start;
        this.stop = stop;
        this.direction = direction;
    }

    public abstract void speed();
}
