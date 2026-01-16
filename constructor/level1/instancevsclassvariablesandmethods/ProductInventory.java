package constructor.level1.instancevsclassvariablesandmethods;
public class ProductInventory {
    String name;
    Integer price;
    static Integer totalProducts;

    ProductInventory(String name, Integer price) {
        totalProducts = 0;
        this.name = name;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);

    }

    void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        ProductInventory product1 = new ProductInventory("Milk", 30);
        product1.displayProductDetails();
        product1.displayTotalProducts();
        System.out.println();
        ProductInventory product2 = new ProductInventory("Sugar", 40);
        product2.displayProductDetails();
        product2.displayTotalProducts();
    }
}