package Assignment3;

import java.util.HashMap;

public class q11SmallestMissingPositiveNumber {
    public static void main(String[] args) {
        int[] unsortedArray = {3, 7, 1, 2, 8, 10, 4, 6, 9};

        int smallestMissing = findSmallestMissingPositive(unsortedArray);

        System.out.println("Smallest Missing Positive Number: " + smallestMissing);
    }

    private static int findSmallestMissingPositive(int[] array) {
        HashMap<Integer, Boolean> elementMap = new HashMap<>();

        for (int num : array) {
            if (num > 0 && num <= 10) {
                elementMap.put(num, true);
            }
        }
        
        for (int i = 1; i <= 10; i++) {
            if (!elementMap.containsKey(i)) {
                return i;
            }
        }

        return 11;
    }
}
