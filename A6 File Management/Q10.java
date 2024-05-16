import java.io.File;
import java.util.sc;

public class q10 {
    public static void main(String[] args) {
        sc sc = new sc(System.in);

        System.out.println("Enter the directory path:");
        String directoryPath = sc.nextLine();

        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The specified directory does not exist.");
            return;
        }

        System.out.println("Contents of directory " + directory.getAbsolutePath() + ":");
        listFilAndSubdir(directory, 0);
    }

    private static void listFilAndSubdir(File directory, int depth) {
        File[] filesAndDir = directory.listFiles();
        if (filesAndDir != null) {
            for (File file : filesAndDir) {
                for (int i = 0; i < depth; i++) {
                    System.out.print("  ");
                }
                System.out.println(file.getName());
                if (file.isDirectory()) {
                    listFilAndSubdir(file, depth + 1);
                }
            }
        }
    }
}