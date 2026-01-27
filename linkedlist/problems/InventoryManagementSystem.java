package linkedlist.problems;

import linkedlist.nodes.SinglyLinkedList;

class Item {
    String name;
    Integer id, quantity, price;

    Item (String name, Integer id, Integer quantity, Integer price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }
    @Override 
    public String toString() {
        return "Item name : " + this.name + ", id : " + this.id + ", quantity : " + this.quantity + ", price : " + this.price;
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        SinglyLinkedList<Item> sll = new SinglyLinkedList<>();
        Item soap = new Item("Soap", 1, 3, 20);
        Item brush = new Item("Brush", 2, 1, 10);
        Item paste = new Item("Colgate", 3, 1, 60);
        sll.insertAtTail(soap);
        sll.insertAtHead(brush);
        sll.insertAtTail(paste);
        sll.displayAllNodes();
        
    }
}
