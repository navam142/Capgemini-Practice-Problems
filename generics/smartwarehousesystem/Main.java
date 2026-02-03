package generics.smartwarehousesystem;
import java.util.List;

public class Main {

    static void displayItems(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            System.out.println(item.id + " -> " + item.name);
        }
    }
    public static void main(String[] args) {
        Storage<Electronics> elecronicsStorage = new Storage<>();
        Storage<Groceries> grocericesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        elecronicsStorage.addItem(new Electronics("Laptop", 1));
        elecronicsStorage.addItem(new Electronics("iPhone", 2));

        grocericesStorage.addItem(new Groceries("milk", 3));
        grocericesStorage.addItem(new Groceries("Peas", 4));

        furnitureStorage.addItem(new Furniture("chair", 5));
        furnitureStorage.addItem(new Furniture("table", 6));

        displayItems(elecronicsStorage.getItems());
        displayItems(grocericesStorage.getItems());
        displayItems(furnitureStorage.getItems());
    }
}
