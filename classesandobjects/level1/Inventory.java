package classesandobjects.level1;

public class Inventory {
    Integer code, price;
    String name;

    void addItems(Integer itemCode, String itemName, Integer price) {
        this.code = itemCode;
        this.name = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("name : " + this.name + "\nprice : " + this.price + "\ncode: " + this.code);
    }

    public static void main(String[] args) {
        Inventory obj = new Inventory();
        obj.addItems(1, "book", 999);
        obj.displayDetails();
    }
}
