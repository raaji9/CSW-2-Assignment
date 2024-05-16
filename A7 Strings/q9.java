import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        System.out.println("Enter the word to search for:");
        String searchW = sc.next();

        System.out.println("Enter the word to replace it with:");
        String replaceWord = sc.next();

        int startIndex = sentence.indexOf(searchW);

        if (startIndex != -1) {
            String modifiedSentence = sentence.substring(0, startIndex) + replaceWord + sentence.substring(startIndex + searchW.length());

            System.out.println("\nOriginal sentence: " + sentence);
            System.out.println("Modified sentence: " + modifiedSentence);
        } else {
            System.out.println("The search word was not found in the sentence.");
        }

        sc.close();
    }
}
