package oopsproblems;

import java.util.*;


interface Reservable {
    boolean reserveItem(Borrower borrower);
    boolean checkAvailability();
}


class Borrower {
    private final String borrowerId;
    private final String name;
    private final String phone;  
    private final String email;  

    public Borrower(String borrowerId, String name, String phone, String email) {
        this.borrowerId = borrowerId;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getBorrowerId() { return borrowerId; }
    public String getName() { return name; }

    public String getMaskedContact() {
        String maskedPhone = (phone.length() >= 4)
                ? "XXXXXX" + phone.substring(phone.length() - 4)
                : "XXXX";

        return "Phone: " + maskedPhone + ", Email: hidden";
    }
}

abstract class LibraryItem implements Reservable {
    private String itemId;
    private String title;
    private String author;

    private boolean isIssued;
    private Borrower currentBorrower;

    private final Queue<Borrower> reservationQueue = new LinkedList<>();

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isIssued = false;
        this.currentBorrower = null;
    }

   
    public String getItemId() { return itemId; }
    public void setItemId(String itemId) { this.itemId = itemId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public boolean isIssued() { return isIssued; }

    
    public abstract int getLoanDuration();

    
    public String getItemDetails() {
        return "ItemId: " + itemId +
                ", Title: " + title +
                ", Author: " + author +
                ", Type: " + getClass().getSimpleName() +
                ", Issued: " + isIssued;
    }

   
    public boolean issueItem(Borrower borrower) {
        if (!checkAvailability()) {
            System.out.println("Item not available for issue: " + title);
            return false;
        }
        isIssued = true;
        currentBorrower = borrower;
        System.out.println(title + " issued to: " + borrower.getName()
                + " for " + getLoanDuration() + " days");
        return true;
    }

    public boolean returnItem() {
        if (!isIssued) {
            System.out.println("Item is not issued, cannot return: " + title);
            return false;
        }

        System.out.println(title + " returned by: " + currentBorrower.getName());
        isIssued = false;
        currentBorrower = null;

        
        if (!reservationQueue.isEmpty()) {
            Borrower next = reservationQueue.poll();
            System.out.println("Auto-issuing reserved item to: " + next.getName());
            issueItem(next);
        }
        return true;
    }

    
    @Override
    public boolean reserveItem(Borrower borrower) {
        if (borrower == null) return false;

        if (checkAvailability()) {
            System.out.println("Item is available, issuing directly instead of reserving: " + title);
            return issueItem(borrower);
        }

        reservationQueue.offer(borrower);
        System.out.println(borrower.getName() + " reserved: " + title);
        return true;
    }

    @Override
    public boolean checkAvailability() {
        return !isIssued;
    }

    
    public void showIssuedTo() {
        if (currentBorrower == null) {
            System.out.println(title + " is not issued to anyone.");
            return;
        }
        System.out.println(title + " currently issued to: " + currentBorrower.getName()
                + " (" + currentBorrower.getBorrowerId() + ")");
        System.out.println("Contact info: " + currentBorrower.getMaskedContact());
    }
}


class Book extends LibraryItem {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21; 
    }
}


class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; 
    }
}


class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; 
    }
}


public class LibrarySystem {
    public static void main(String[] args) {

        Borrower b1 = new Borrower("B001", "Navam", "9876543210", "navam@gmail.com");
        Borrower b2 = new Borrower("B002", "Aman", "9123456780", "aman@gmail.com");
        Borrower b3 = new Borrower("B003", "Riya", "9988776655", "riya@gmail.com");

        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("BK101", "Clean Code", "Robert C. Martin"));
        items.add(new Magazine("MG201", "Time Magazine - Jan", "Time Editors"));
        items.add(new DVD("DVD301", "Interstellar", "Christopher Nolan"));

        System.out.println("---- Library Items ----");
        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
        }

        System.out.println("\n---- Issue + Reserve Demo ----");

        LibraryItem book = items.get(0);
        book.issueItem(b1);        
        book.showIssuedTo();

        
        book.reserveItem(b2);
        book.reserveItem(b3);

        
        System.out.println("\nReturning the book...");
        book.returnItem();

        System.out.println("\nBook status after return:");
        book.showIssuedTo();
    }
}
