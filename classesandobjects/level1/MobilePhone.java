package classesandobjects.level1;

public class MobilePhone {
    String brand, model;
    Integer price;

    MobilePhone(String brand, String model, Integer price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("brand : " + this.brand + "\nmodel: " + this.model + "\nprice: " + this.price);
    }

    public static void main(String[] args) {
        MobilePhone iPhone = new MobilePhone("Apple", "17", 1400);
        iPhone.displayDetails();
    }
}
