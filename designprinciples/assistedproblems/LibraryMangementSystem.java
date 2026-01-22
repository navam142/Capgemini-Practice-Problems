package designprinciples.assistedproblems;

import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void showBookDetails() {
        System.out.println("Title: " + title + " | Author: " + author);
    }
}

class Library {
    private String libraryName;
    private ArrayList<Book> books; // Aggregation: Library contains Books

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showLibraryBooks() {
        System.out.println("\n📚 Library: " + libraryName);
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book b : books) {
            b.showBookDetails();
        }
    }
}

public class LibraryMangementSystem {
    public static void main(String[] args) {

        Book b1 = new Book("Harry Potter", "J.K. Rowling");
        Book b2 = new Book("Atomic Habits", "James Clear");
        Book b3 = new Book("The Alchemist", "Paulo Coelho");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2); 
        lib2.addBook(b3);

        lib1.showLibraryBooks();
        lib2.showLibraryBooks();
    }
}
