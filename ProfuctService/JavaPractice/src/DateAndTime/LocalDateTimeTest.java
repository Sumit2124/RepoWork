package DateAndTime;

import java.time.LocalDateTime;

public class LocalDateTimeTest
{
    public static void main(String[] args) {
        LocalDateTime now=LocalDateTime.now();
        System.out.println(now);
        LocalDateTime myDate=LocalDateTime.parse("2024-02-03T6:06");

    }
}
