package DateAndTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ZoneDDateTimetest
{
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        List<String> strings = availableZoneIds.stream().filter(s -> s.startsWith("Asia/Ca")).collect(Collectors.toList());
        System.out.println(strings);
//        ZonedDateTime time1=ZonedDateTime.of(ZoneId.of());
    }
}
