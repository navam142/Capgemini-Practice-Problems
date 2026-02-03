package generics.smartwarehousesystem;
import java.util.*;


public class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    
    void addItem (T item) {
        items.add(item);
    }

    List<T> getItems() {
        return items;
    }
}