import java.io.File;
import java.util.sc;

public class q8 {

    public static void main(String[] args) {
        sc sc = new sc(System.in);

        System.out.println("Enter the current file name:");
        String curName = sc.nextLine();

        System.out.println("Enter the new file name:");
        String newFileName = sc.nextLine();

        File currentFile = new File(curName);
        File newFile = new File(newFileName);

        if (!currentFile.exists()) {
            System.out.println("The specified file does not exist.");
            return;
        }

        if (newFile.exists()) {
            System.out.println("A file with the new name already exists. Renaming canceled.");
            return;
        }

        boolean renamed = currentFile.renameTo(newFile);
        if (renamed) {
            System.out.println("File successfully renamed to " + newFileName);
        } else {
            System.out.println("Failed to rename the file.");
        }
    }
}
