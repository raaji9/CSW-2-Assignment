package Assignment3;

import java.util.HashMap;
import java.util.Map;

class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }
}

public class q05Library {
    public static void main(String[] args) {

        Map<Integer, Book> bookMap = new HashMap<>();

        Book book1 = new Book(1, "The Alchemist", "Paulo Coelho", 20);
        Book book2 = new Book(2, "To Kill a Mockingbird", "Harper Lee", 15);

        bookMap.put(book1.getId(), book1);
        bookMap.put(book2.getId(), book2);

        System.out.println("Collection of Books in the Library:");
        for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
            Book book = entry.getValue();
            System.out.println("ID: " + book.getId() +
                    ", Name: " + book.getName() +
                    ", Author: " + book.getAuthor() +
                    ", Quantity: " + book.getQuantity());
        }

        String bookToCheck = "The Alchemist";
        boolean isBookPresent = checkBookPresence(bookMap, bookToCheck);
        System.out.println("\nIs '" + bookToCheck + "' present in the Library? " + isBookPresent);

        int keyToRemove = 1;
        removeBook(bookMap, keyToRemove);

        System.out.println("\nUpdated Collection of Books in the Library:");
        for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
            Book book = entry.getValue();
            System.out.println("ID: " + book.getId() +
                    ", Name: " + book.getName() +
                    ", Author: " + book.getAuthor() +
                    ", Quantity: " + book.getQuantity());
        }
    }

    private static boolean checkBookPresence(Map<Integer, Book> bookMap, String bookName) {
        return bookMap.values().stream().anyMatch(book -> book.getName().equals(bookName));
    }

    private static void removeBook(Map<Integer, Book> bookMap, int key) {
        if (bookMap.containsKey(key)) {
            Book removedBook = bookMap.remove(key);
            System.out.println("\nRemoved Book: " +
                    "ID: " + removedBook.getId() +
                    ", Name: " + removedBook.getName() +
                    ", Author: " + removedBook.getAuthor() +
                    ", Quantity: " + removedBook.getQuantity());
        } else {
            System.out.println("\nBook with ID " + key + " not found in the Library. No book removed.");
        }
    }
}
