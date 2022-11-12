package date_tiime.exercises.ex2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2018-05-06");
        LocalTime localTime = LocalTime.parse("23:25:43");
        System.out.println(localTime);
        System.out.println(localDate);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime.getDayOfWeek());
    }
}
