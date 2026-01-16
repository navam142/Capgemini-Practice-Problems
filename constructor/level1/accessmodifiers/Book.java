package constructor.level1.accessmodifiers;

class Book {
    public String ISBN;       
    protected String title;     
    private String author;     

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
    public static void main(String[] args) {
        Book javaPrinciples = new Book("ISBN", "Java Principles", "Oracle");
        javaPrinciples.displayInfo();
        javaPrinciples.setAuthor("Navam");
        javaPrinciples.displayInfo();
    }
}
