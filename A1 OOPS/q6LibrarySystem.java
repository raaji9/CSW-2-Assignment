package Assignment1;

import java.time.LocalDate;

abstract class LibraryResource {
    private String title;
    private String author;

    public LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract void displayDetails();
}

class Book extends LibraryResource {
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Page Count: " + getPageCount());
    }
}

class Magazine extends LibraryResource {
    private LocalDate issueDate;

    public Magazine(String title, String author, LocalDate issueDate) {
        super(title, author);
        this.issueDate = issueDate;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Issue Date: " + getIssueDate());
    }
}

class DVD extends LibraryResource {
    private int duration;

    public DVD(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Duration: " + getDuration() + " minutes");
    }
}

public class q6LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("Ikigai", "Hector Garcia, Francesc Miralles", 162);
        Magazine magazine = new Magazine("Tinkle", "Kuriakose Saju Vaisian", LocalDate.of(2024, 03, 07));
        DVD dvd = new DVD("The Godfather", "Francis Ford Coppola", 178);

        book.displayDetails();
        System.out.println();
        magazine.displayDetails();
        System.out.println();
        dvd.displayDetails();
    }
}