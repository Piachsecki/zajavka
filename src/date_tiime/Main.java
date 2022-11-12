package date_tiime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020, 12, 20);
        System.out.println("localDate = " + localDate);
        System.out.println( localDate.plusYears(1));
        System.out.println( localDate.plusWeeks(1));
        System.out.println( localDate.plusDays(1));
        System.out.println();

        System.out.println( localDate);


        LocalDateTime localDateTime = LocalDateTime.of(2021, 12, 20, 13, 5);
        System.out.println("localDateTime = " + localDateTime);
        System.out.println( localDateTime.plusYears(1));
        System.out.println( localDateTime.plusWeeks(1));
        System.out.println( localDateTime.plusDays(1));
        System.out.println( localDateTime.plusNanos(10000));
        System.out.println();

        System.out.println( localDateTime);

    }
}
