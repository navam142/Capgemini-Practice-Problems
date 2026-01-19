package inheritance.single;

class Book {
    String title;
    Integer publicationYear;
}

class Author extends Book {
    String authorName;
    String authorAddress;

    Author(String title, Integer publicationYear, String authorName, String authorAddress) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.authorName = authorName;
        this.authorAddress = authorAddress;
    }

    public void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author Name: " + authorName);
        System.out.println("Author Address: " + authorAddress);
    }

}


public class LibraryManagement {
    public static void main(String[] args) {
        Author author = new Author("The Lord of the Rings", 1954, "J.R.R. Tolkien", "England");
        author.displayBookDetails();
    }

}