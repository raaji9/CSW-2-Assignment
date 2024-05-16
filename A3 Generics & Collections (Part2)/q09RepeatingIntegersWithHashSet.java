package Assignment3;

import java.util.HashSet;

public class q09RepeatingIntegersWithHashSet {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 9, 4};

        HashSet<Integer> uniqueSet = new HashSet<>();

        HashSet<Integer> repeatingSet = new HashSet<>();

        System.out.println("Repeating Integers in the Array:");

        for (int num : array) {
            if (!uniqueSet.add(num)) {
                repeatingSet.add(num);
            }
        }

        for (int repeatingNum : repeatingSet) {
            System.out.print(repeatingNum + " ");
        }
    }
}

