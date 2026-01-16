package constructor.level1;

public class Book {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public Book() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.price = 0.0;
        this.available = true;
    }

    public Book(String title, String author, double price) {
        this(title, author, price, true);
    }

    public Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = Math.max(0, price);
        this.available = available;
    }

    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        this.available = other.available;
    }

    public boolean borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book '" + title + "' has been borrowed successfully!");
            return true;
        } else {
            System.out.println("Sorry, '" + title + "' is currently not available.");
            return false;
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book '" + title + "' has been returned.");
        }
    }

    public void displayInfo() {
        System.out.println("\n--- Book Information ---");
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Price      : $" + String.format("%.2f", price));
        System.out.println("Available  : " + (available ? "Yes" : "No"));
        System.out.println("------------------------");
    }


    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert C. Martin", 45.99);
        book1.displayInfo();
        
        book1.borrowBook();
        book1.displayInfo();
        
        book1.borrowBook(); 
        book1.returnBook();
        book1.displayInfo();
    }
}