package date_tiime;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class PeriodExample {
    public static void main(String[] args) {
//        System.out.println(OffsetDateTime.now());

//        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, ZoneOffset.UTC);
//        System.out.println(offsetDateTime);
//        System.out.println(OffsetDateTime.of(localDateTime, ZoneOffset.of("+05:00")));
        LocalDate localDate = LocalDate.of(2020, 12, 10);
        LocalTime localTime = LocalTime.of(21, 25, 34);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
//        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        ZoneId paris = ZoneId.of("Europe/Paris");
//        System.out.println(paris);
//        System.out.println(ZonedDateTime.of(localDate, localTime, paris));
//        System.out.println(ZonedDateTime.of(localDateTime, ZoneOffset.UTC));

//        localDate1LocalDate.of(2020, 12, 10);
        LocalDate localDate2 = LocalDate.of(2024, 5, 8);
//        Period betweenDays = localTime.get(Period.of(2, 4 , 5));
//        System.out.println(Period.between(localDate1, localDate2));
        Period period = Period.ofDays(2);
        Period period1 = Period.ofMonths(2);
        Period period2 = Period.ofYears(2);
//        long between = ChronoUnit.DAYS.between(localDate1, localDate2);
//        System.out.println(between);
        Period period3 = Period.ZERO.plusDays(5432);
        System.out.println(period3);

        System.out.println(period);
        System.out.println(period1);
        System.out.println(period2);


    }
}
