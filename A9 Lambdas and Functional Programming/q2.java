import java.util.*;
interface StringComparator {
    int compare(String s1, String s2);
}

public class q2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        strings.add("grape");
        strings.add("kiwi");

        StringComparator lengthComparator = (s1, s2) -> Integer.compare(s2.length(), s1.length());

        Collections.sort(strings, (s1, s2) -> lengthComparator.compare(s1, s2));

        System.out.println("Sorted list in descending order of length:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
