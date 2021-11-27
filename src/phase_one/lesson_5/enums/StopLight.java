package phase_one.lesson_5.enums;

public class StopLight {
    enum StopLights{
        RED,
        YELLOW,
        GREEN
    }

    public static void main(String[] args) {
        StopLights myStoplight = StopLights.RED;
        System.out.println(myStoplight);
    }
}
