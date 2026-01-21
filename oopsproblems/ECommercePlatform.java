package oopsproblems;

// Taxable Interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract Product Class
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // Abstract Method
    public abstract double calculateDiscount();
}

// Electronics Class
class Electronics extends Product implements Taxable {
    private double taxRate = 0.18;
    private double discountRate = 0.05;

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "GST: " + (taxRate * 100) + "%";
    }

    public void displayDetails() {
        System.out.println("Product ID: " + getProductId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println(getTaxDetails());
        System.out.println("Discount: " + calculateDiscount());
    }
}

// Clothing Class
class Clothing extends Product implements Taxable {
    private double taxRate = 0.12;
    private double discountRate = 0.10;

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "GST: " + (taxRate * 100) + "%";
    }

    public void displayDetails() {
        System.out.println("Product ID: " + getProductId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println(getTaxDetails());
        System.out.println("Discount: " + calculateDiscount());
    }
}

// Groceries Class
class Groceries extends Product {
    private double discountRate = 0.05;

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + getProductId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Discount: " + calculateDiscount());
    }
}

// ECommercePlatform Class
public class ECommercePlatform {
    public static void calculateFinalPrice(Product product) {
        double tax = 0;
        if (product instanceof Taxable) {
            tax = ((Taxable) product).calculateTax();
        }
        double finalPrice = product.getPrice() + tax - product.calculateDiscount();
        System.out.println("Final Price: " + finalPrice);
    }

    public static void main(String[] args) {
        Product electronics = new Electronics(1, "Laptop", 50000);
        Product clothing = new Clothing(2, "Shirt", 1000);
        Product groceries = new Groceries(3, "Rice", 500);

        System.out.println("Electronics Details:");
        ((Electronics) electronics).displayDetails();
        calculateFinalPrice(electronics);
        System.out.println();

        System.out.println("Clothing Details:");
        ((Clothing) clothing).displayDetails();
        calculateFinalPrice(clothing);
        System.out.println();

        System.out.println("Groceries Details:");
        ((Groceries) groceries).displayDetails();
        calculateFinalPrice(groceries);
    }
}