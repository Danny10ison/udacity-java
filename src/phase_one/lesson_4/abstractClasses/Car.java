package phase_one.lesson_4.abstractClasses;

public class Car extends Vehicle{
    public Car() {
        super("Car start", "Car stop", "Car direction");
    }
    @Override
    public void speed() {
        System.out.println("55");
    }
}
