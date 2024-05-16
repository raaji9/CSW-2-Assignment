import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class q11 {
    public static void main(String[] args) {
        Instant instant = Instant.parse("2024-05-14T10:15:30Z");

        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = instant.atZone(zoneId);

        System.out.println("Local Date and Time in New York: " + zonedDateTime);
    }
}
