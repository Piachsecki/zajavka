package date_tiime.exercises.ex5;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();


        Period period1 = Period.of(2020, 12, 12);
        Period period2 = Period.of(2022, 12, 12);
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2020, 12, 25);
        Period period3 = Period.between(localDate1, localDate2);
        System.out.println(period3);
        Instant instant = Instant.now();
        System.out.println(instant);
    }
}
