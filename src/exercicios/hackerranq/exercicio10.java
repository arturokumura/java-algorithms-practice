package exercicios.hackerranq;

import java.time.LocalDate;

public class exercicio10 {
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year,month, day);
        return date.getDayOfWeek().toString();
    }
}
