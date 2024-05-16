import java.io.File;
import java.util.sc;

public class q4 {

    public static void main(String[] args) {
        sc sc = new sc(System.in);

        System.out.println("Enter the directory path:");
        String directoryPath = sc.nextLine();

        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The specified directory does not exist.");
            return;
        }

        File[] filesAndDir = directory.listFiles();
        if (filesAndDir != null) {
            System.out.println("Files and subdirectories in " + directory.getAbsolutePath() + ":");
            for (File file : filesAndDir) {
                if (file.isDirectory()) {
                    System.out.println("[Directory] " + file.getName());
                } else {
                    System.out.println("[File] " + file.getName());
                }
            }
        } else {
            System.out.println("Failed to list files and subdirectories in the directory.");
        }
    }
}
