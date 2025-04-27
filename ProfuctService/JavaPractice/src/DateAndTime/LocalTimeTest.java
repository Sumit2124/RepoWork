package DateAndTime;

import java.time.LocalTime;

public class LocalTimeTest
{
    public static void main(String[] args) {
        LocalTime time=LocalTime.now();
        System.out.println(time);
        LocalTime currentTime=LocalTime.of(16,30);
        System.out.println(currentTime);
        System.out.println(currentTime.minusHours(1));
    }
}
