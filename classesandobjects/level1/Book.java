package classesandobjects.level1;

public class Book {
    String title, author;
    Integer price;

    Book(String title, String author, Integer price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("title : " + this.title + "\nauthor : " + this.author + "\nprice: " + this.price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java concepts", "Oracle", 999);
        b1.displayDetails();
    }
}
