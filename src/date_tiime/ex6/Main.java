package date_tiime.ex6;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2016, 10, 02, 12, 05, 10);

//        System.oult.println(ZoneOffset.getAvaiableZoneIds());
//        OffsetDateTime offsetDateTime = OffsetDateTime.of(+localDateTime, ZoneOffset.of("Poland"));
        ZonedDateTime offsetDateTime1 = ZonedDateTime.of(localDateTime, ZoneId.of("Poland"));
//        ZonedDateTime offsetDateTime2 = ZonedDateTime.of(localDateTime, ZoneId.of("New York"));
        System.out.println(offsetDateTime1);
//        System.out.println(offsetDateTime2);
    }
}
