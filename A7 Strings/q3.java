import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer text = new StringBuffer();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1 Append text");
            System.out.println("2 Insert text");
            System.out.println("3 Delete text");
            System.out.println("4 Reverse text");
            System.out.println("5 Replace text");
            System.out.println("6 Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter text to append:");
                    String appendText = sc.nextLine();
                    text.append(appendText);
                    displayText(text);
                    break;
                case 2:
                    System.out.println("Enter index to insert:");
                    int insertIndex = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.println("Enter text to insert:");
                    String insertText = sc.nextLine();
                    text.insert(insertIndex, insertText);
                    displayText(text);
                    break;
                case 3:
                    System.out.println("Enter start index to delete:");
                    int startIndex = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.println("Enter end index to delete:");
                    int endIndex = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    text.delete(startIndex, endIndex);
                    displayText(text);
                    break;
                case 4:
                    text.reverse();
                    displayText(text);
                    break;
                case 5:
                    System.out.println("Enter start index to replace:");
                    int replaceStartInd = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.println("Enter end index to replace:");
                    int replaceEndIndex = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.println("Enter replacement text:");
                    String replacementText = sc.nextLine();
                    text.replace(replaceStartInd, replaceEndIndex, replacementText);
                    displayText(text);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }

    private static void displayText(StringBuffer text) {
        System.out.println("Current text: " + text);
        System.out.println("Current capacity: " + text.capacity());
        System.out.println("Current length: " + text.length());
    }
}
