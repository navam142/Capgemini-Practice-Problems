package linkedlist.nodes;

public class Node<T> {
    protected T data;
    protected Node<T> next;

    Node() {
        
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    void displayData(){
        System.out.println(data.toString());
    }

} 