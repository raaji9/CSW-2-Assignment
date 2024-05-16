import java.io.*;
public class q5 {

    public static void main(String[] args) {
        sc sc = new sc(System.in);

        System.out.println("Enter the directory path:");
        String directoryPath = sc.nextLine();

        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The specified directory does not exist.");
            return;
        }

        File[] txtF = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));
        if (txtF != null && txtF.length > 0) {
            System.out.println("Text files in " + directory.getAbsolutePath() + ":");
            for (File txtFile : txtF) {
                System.out.println(txtFile.getName());
            }
        } else {
            System.out.println("No text files found in the directory.");
        }
    }
}