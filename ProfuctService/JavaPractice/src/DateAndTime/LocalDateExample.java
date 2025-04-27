package DateAndTime;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample
{
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate customDate=LocalDate.of(2000,2,3);
        int dayOfMonth=customDate.getDayOfMonth();
        Month month=customDate.getMonth();
        int dayOfYear = customDate.getDayOfYear();
        int year = customDate.getYear();
        System.out.println(dayOfMonth+" "+month+" "+ year);
        LocalDate today=LocalDate.now();
        LocalDate yesterday = today.minusDays(1);
        System.out.println(yesterday);
    }
}
