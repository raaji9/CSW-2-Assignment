package Assignment3;

import java.util.Scanner;
import java.util.TreeSet;

public class q06TreeSetOperations {
    public static void main(String[] args) {

        TreeSet<Integer> numberSet = new TreeSet<>();

        numberSet.add(10);
        numberSet.add(5);
        numberSet.add(20);
        numberSet.add(15);
        numberSet.add(25);

        displayTreeSet(numberSet);

        searchNumber(numberSet);

        removeElement(numberSet);

        System.out.println("\nUpdated TreeSet after removal:");
        displayTreeSet(numberSet);
    }

    private static void displayTreeSet(TreeSet<Integer> numberSet) {
        System.out.println("TreeSet Elements:");
        for (Integer number : numberSet) {
            System.out.println(number);
        }
    }

    private static void searchNumber(TreeSet<Integer> numberSet) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a number to search in the TreeSet: ");
        int numberToSearch = scanner.nextInt();

        boolean isPresent = numberSet.contains(numberToSearch);
        System.out.println("Is the number " + numberToSearch + " present in the TreeSet? " + isPresent);
    }

    private static void removeElement(TreeSet<Integer> numberSet) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a number to remove from the TreeSet: ");
        int numberToRemove = scanner.nextInt();

        if (numberSet.contains(numberToRemove)) {
            numberSet.remove(numberToRemove);
            System.out.println("Removed element: " + numberToRemove);
        } else {
            System.out.println("Element " + numberToRemove + " not found in the TreeSet. No element removed.");
        }
    }
}
