import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.sc;

public class q3 {

    public static void main(String[] args) {
        sc sc = new sc(System.in);

        System.out.println("Enter your new diary entry:");
        String newEntry = sc.nextLine();

        LocalDateTime currentDateTime = LocalDateTime.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(format);

        try (FileWriter writer = new FileWriter("diary.txt", true)) {
            writer.write("\n" + formattedDateTime + ": " + newEntry);
            System.out.println("New entry added to the diary.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
}
