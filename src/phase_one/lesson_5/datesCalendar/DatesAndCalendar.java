package phase_one.lesson_5.datesCalendar;

import java.util.Calendar;
import java.util.Date;

public class DatesAndCalendar {

    public static void main(String[] args) {

    }

    private static void displayCurrent(){
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        Date date = new Date();
        cal.setTime(date);
        System.out.println(cal.getTime());
    }
}
