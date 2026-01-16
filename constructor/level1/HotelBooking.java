package constructor.level1;

public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
        System.out.println("Default booking created for Unknown guest");
    }


    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = Math.max(1, nights); // minimum 1 night
        System.out.println("Parameterized booking created for " + guestName);
    }

    
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName + " (copy)";
        this.roomType = other.roomType;
        this.nights = other.nights;
        System.out.println("Copy booking created for " + this.guestName);
    }

    public void displayBooking() {
        System.out.println("\n--- Booking Details ---");
        System.out.println("Guest Name   : " + guestName);
        System.out.println("Room Type    : " + roomType);
        System.out.println("Nights       : " + nights);
        System.out.println("------------------------");
    }

   
    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();                   
        HotelBooking b2 = new HotelBooking("Navam Singh", "Deluxe", 5); 
        HotelBooking b3 = new HotelBooking(b2);                

        b1.displayBooking();
        b2.displayBooking();
        b3.displayBooking();
    }
}