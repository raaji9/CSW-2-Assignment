public class q2 {
    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println("Original string: " + str1);

        String str2 = str1.concat(" World");
        System.out.println("Concatenated string: " + str2);

        System.out.println("Original string after concatenation: " + str1);

        CharSequence charSeq = "Java";
        System.out.println("\nCharacter sequence: " + charSeq);

        System.out.println("Length of character sequence: " + charSeq.length());

        System.out.println("Character at index 2: " + charSeq.charAt(2));

        System.out.println("Subsequence from index 1 to 3: " + charSeq.subSequence(1, 3));
    }
}
