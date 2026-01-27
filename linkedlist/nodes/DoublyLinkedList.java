package linkedlist.nodes;

import java.util.function.Predicate;

public class DoublyLinkedList<T> extends Node<T> {
    int size ;
    Node<T> prev, head, tail;
    
    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void insertAtHead(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertAtTail(T data) {
        if (head == null) {
            insertAtHead(data);
        } else {
            Node<T> newNode = new Node<>(data);
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAt(Integer index, T data) {
        
        if (index < 0 || index > size) {
            System.out.println("invalid index");
            return;
        }
        
        if (index == 0) {
            insertAtHead(data);
        } else {
            int s = 0;
            Node<T> temp = head;
            Node<T> newNode = new Node<>(data);
            while (s < index) {
                temp = temp.next;
                s++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public boolean deleteIf(Predicate<T> condition) {
        if (head == null) return false;

        boolean deleted = false;

        // Delete from head
        while (head != null && condition.test(head.data)) {
            head = head.next;
            size--;
            deleted = true;
        }

        if (head == null) return deleted;

        Node<T> prev = head;
        Node<T> curr = head.next;

        while (curr != null) {
            if (condition.test(curr.data)) {
                prev.next = curr.next;
                size--;
                deleted = true;
                curr = prev.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        return deleted;
    }

    public T searchIf(Predicate<T> condition) {
        Node<T> current = head;
        while (current != null) {
            if (condition.test(current.data)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public String displayAllNodes() {
        return data.toString();
    }
}
