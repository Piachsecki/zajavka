package date_tiime.exercises.ex1;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(2020, 10, 21, 15, 43, 25, 25, ZoneOffset.UTC);
        LocalTime localTime = LocalTime.of(15, 45, 25);
        LocalDate localDate = LocalDate.of(2022, 12, 11);
//        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(localDate, localTime, ZoneOffset.MIN);
//        OffsetDateTime offsetDateTime3 = OffsetDateTime.now();
//        OffsetDateTime offsetDateTime4 = OffsetDateTime.of(LocalDate.of(2020, 12, 25), LocalTime.of(15, 12, 45), ZoneOffset.MAX);
//        OffsetDateTime offsetDateTime5 = OffsetDateTime.of(LocalDateTime.of(2020, 10, 21, 15, 43, 25, 25), ZoneOffset.UTC);
//        System.out.println(offsetDateTime1);
//        System.out.println(offsetDateTime2);
//        System.out.println(offsetDateTime3);
//        System.out.println(offsetDateTime4);
//        System.out.println(offsetDateTime5);

        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(offsetDateTime1));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(offsetDateTime1));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(offsetDateTime1));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(offsetDateTime1));

    }
}
