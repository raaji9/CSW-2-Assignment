import java.util.*;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputStr = sc.nextLine();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 Convert to lowercase");
            System.out.println("2 Convert to uppercase");
            System.out.println("3 Search for a character");
            System.out.println("4 Search for an index");
            System.out.println("5 Concatenate with another string");
            System.out.println("6 Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Lowercase: " + inputStr.toLowerCase());
                    break;
                case 2:
                    System.out.println("Uppercase: " + inputStr.toUpperCase());
                    break;
                case 3:
                    System.out.print("Enter the character to search for: ");
                    char searchChar = sc.nextLine().charAt(0);
                    int index = inputStr.indexOf(searchChar);
                    if (index != -1) {
                        System.out.println("Character '" + searchChar + "' found at index: " + index);
                    } else {
                        System.out.println("Character '" + searchChar + "' not found in the string.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the index to search for: ");
                    int searchIndex = sc.nextInt();
                    if (searchIndex >= 0 && searchIndex < inputStr.length()) {
                        System.out.println("Character at index " + searchIndex + ": " + inputStr.charAt(searchIndex));
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 5:
                    System.out.print("Enter the string to concatenate: ");
                    String concatString = sc.nextLine();
                    System.out.println("Concatenated string: " + inputStr.concat(concatString));
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}
