import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class q10 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        // Formatting LocalDateTime to custom string format
        DateTimeFormatter form = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(form);

        System.out.println("Formatted DateTime: " + formattedDateTime);
    }
}
