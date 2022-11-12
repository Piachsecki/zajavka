package date_tiime.exercises.ex3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2012-06-24");
        System.out.println(localDate.getMonth());
    }
}
