import java.util.*;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputStr = sc.nextLine();

        char[] charArray = inputStr.toCharArray();

        System.out.println("Enter a character to search in the string:");
        char searchChar = sc.next().charAt(0);

        int firstInd = -1;
        int lastInd = -1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == searchChar) {
                if (firstInd == -1) {
                    firstInd = i;
                }
                lastInd = i;
            }
        }

        System.out.println("\nCharacter array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        if (firstInd != -1) {
            System.out.println("First occurrence of '" + searchChar + "' at position: " + firstInd);
            System.out.println("Last occurrence of '" + searchChar + "' at position: " + lastInd);
        } else {
            System.out.println("The character '" + searchChar + "' was not found in the string.");
        }

        sc.close();
    }
}
