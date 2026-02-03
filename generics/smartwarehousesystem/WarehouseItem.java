package generics.smartwarehousesystem;

abstract public class WarehouseItem {
    String name;
    Integer id;

    WarehouseItem(String name, Integer id) {
        this.name = name;
        this.id = id;
    }
}
