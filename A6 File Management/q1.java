import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class q1 {

    public static void main(String[] args) {
        sc sc = new sc(System.in);

        System.out.println("Enter your diary entry:");
        String ent = sc.nextLine();

        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDate.format(format);

        File file = new File("diary.txt");
        if (file.exists()) {
            System.out.println("File already exists. Appending to existing file.");
        }

        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(formattedDate + ": " + ent + "\n");
            System.out.println("Entry added to diary.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
