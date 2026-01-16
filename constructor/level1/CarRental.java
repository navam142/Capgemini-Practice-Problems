package constructor.level1;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 45.0; // example rate

    // Default Constructor
    public CarRental() {
        this.customerName = "Walk-in Customer";
        this.carModel = "Economy Car";
        this.rentalDays = 1;
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = Math.max(1, rentalDays);
    }

    // Copy Constructor
    public CarRental(CarRental other) {
        this.customerName = other.customerName + " (copy)";
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }

    public void displayRentalInfo() {
        System.out.println("\n=== Car Rental Details ===");
        System.out.println("Customer     : " + customerName);
        System.out.println("Car Model    : " + carModel);
        System.out.println("Rental Days  : " + rentalDays);
        System.out.printf("Total Cost   : $%.2f%n", calculateTotalCost());
        System.out.println("==========================");
    }

    // Demo
    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        CarRental rental2 = new CarRental("Navam Singh", "Toyota Camry", 7);
        CarRental rental3 = new CarRental(rental2);

        rental1.displayRentalInfo();
        rental2.displayRentalInfo();
        rental3.displayRentalInfo();
    }
}