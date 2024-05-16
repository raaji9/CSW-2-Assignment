import java.io.*;
import java.util.sc;

public class q7 {

    public static void main(String[] args) {
        sc sc = new sc(System.in);

        System.out.println("Enter the source file path:");
        String sourceFilePath = sc.nextLine();

        System.out.println("Enter the destination file path:");
        String destnFilePath = sc.nextLine();

        File sourceFile = new File(sourceFilePath);
        File destnFile = new File(destnFilePath);

        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        if (destnFile.exists()) {
            System.out.println("Destination file already exists. Do you want to overwrite it? (Y/N)");
            String overwriteChoice = sc.nextLine().trim().toLowerCase();
            if (!overwriteChoice.equals("y")) {
                System.out.println("File copy operation canceled.");
                return;
            }
        }

        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(destnFile)) {
            int data;
            while ((data = reader.read()) != -1) {
                writer.write(data);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}
