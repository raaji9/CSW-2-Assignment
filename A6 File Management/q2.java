import java.io.File;
import java.io.FileNotFoundException;
import java.util.sc;

public class q2 {

    public static void main(String[] args) {
        File file = new File("diary.txt");

        if (!file.exists()) {
            System.out.println("The diary file does not exist.");
            return;
        }

        try (sc sc = new sc(file)) {
            System.out.println("Contents of diary:");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
