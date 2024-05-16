import java.util.*;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String firstString = sc.nextLine();

        System.out.println("Enter the second string:");
        String secondString = sc.nextLine();

        String fLow = firstString.toLowerCase();
        String fUp = firstString.toUpperCase();
        String sLow = secondString.toLowerCase();
        String sUp = secondString.toUpperCase();

        boolean isEqualIgnoreCase = fLow.equals(sLow);

        System.out.println("\nFirst String:");
        System.out.println("Lowercase: " + fLow);
        System.out.println("Uppercase: " + fUp);
        System.out.println("\nSecond String:");
        System.out.println("Lowercase: " + sLow);
        System.out.println("Uppercase: " + sUp);
        System.out.println("\nComparison (case-insensitive): " + isEqualIgnoreCase);

        sc.close();
    }
}
