import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();
        StringBuilder strBuild = new StringBuilder(input);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1 Add a substring at a specified position");
            System.out.println("2 Remove a range of characters");
            System.out.println("3 Modify a character at a specified index");
            System.out.println("4 Concatenate another string at the end");
            System.out.println("5 Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("Enter substring to add:");
                    String substringToAdd = sc.nextLine();
                    System.out.println("Enter position to add:");
                    int positionToAdd = sc.nextInt();
                    strBuild.insert(positionToAdd, substringToAdd);
                    break;
                case 2:
                    System.out.println("Enter start index to remove:");
                    int startIndexToRemove = sc.nextInt();
                    System.out.println("Enter end index to remove:");
                    int endIndexToRemove = sc.nextInt();
                    strBuild.delete(startIndexToRemove, endIndexToRemove);
                    break;
                case 3:
                    System.out.println("Enter index to modify:");
                    int indexToModify = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.println("Enter character to replace:");
                    char characterToReplace = sc.nextLine().charAt(0);
                    strBuild.setCharAt(indexToModify, characterToReplace);
                    break;
                case 4:
                    System.out.println("Enter string to concatenate:");
                    String stringToConcatenate = sc.nextLine();
                    strBuild.append(stringToConcatenate);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                    continue;
            }

            System.out.println("Modified string: " + strBuild.toString());
        }
    }
}
