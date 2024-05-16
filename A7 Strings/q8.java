import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String firstString = sc.nextLine();

        System.out.println("Enter the second string:");
        String secondString = sc.nextLine();

        String concatMRes = firstString.concat(secondString);
        String plusOpRes = firstString + secondString;

        System.out.println("\nConcatenation using concat() method: " + concatMRes);
        System.out.println("Concatenation using + operator: " + plusOpRes);

        System.out.println("\nEnter an index number to retrieve the character:");
        int index = sc.nextInt();

        if (index >= 0 && index < concatMRes.length()) {
            char characterAtIndex = concatMRes.charAt(index);
            System.out.println("Character at index " + index + ": " + characterAtIndex);
        } else {
            System.out.println("Invalid index. Please enter a valid index within the range of the concatenated string.");
        }

        sc.close();
    }
}
