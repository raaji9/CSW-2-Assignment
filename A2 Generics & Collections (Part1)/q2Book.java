package Assignment2;

public class q2Book {
    private int bookId;
    private String bookName;
    private double price;

    public q2Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q2Book book = (q2Book) obj;
        return bookId == book.bookId && Double.compare(book.price, price) == 0 && bookName.equals(book.bookName);
    }

    @Override
    public String toString() {
        return "Book: " +"bookId: " + bookId +", bookName: " + bookName +", price: " + price;
    }

    public static void main(String[] args) {
        q2Book book1 = new q2Book(1, "Book1", 20.5);
        q2Book book2 = new q2Book(2, "Book2", 15.99);

        if (book1.equals(book2)) {
            System.out.println("The books have the same details.");
        } else {
            System.out.println("The books have different details.");
        }

        System.out.println(book1.toString());
        System.out.println(book2.toString());

        if (book1.getPrice() > book2.getPrice()) {
            System.out.println("Book1 is more expensive than Book2.");
        } else if (book1.getPrice() < book2.getPrice()) {
            System.out.println("Book2 is more expensive than Book1.");
        } else {
            System.out.println("The books have the same price.");
        }
    }
}