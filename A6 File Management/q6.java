import java.io.File;
import java.util.sc;

public class q6 {
    public static void main(String[] args) {
        sc sc = new sc(System.in);

        System.out.println("Enter the name of the file to delete:");
        String fileN = sc.nextLine();

        File file = new File(fileN);

        if (!file.exists()) {
            System.out.println("File '" + fileN + "' does not exist.");
            return;
        }

        boolean deleted = file.delete();
        if (deleted) {
            System.out.println("File '" + fileN + "' has been successfully deleted.");
        } else {
            System.out.println("Failed to delete file '" + fileN + "'.");
        }
    }
}
