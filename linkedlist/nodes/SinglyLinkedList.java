package linkedlist.nodes;

import java.util.function.Predicate;

public class SinglyLinkedList<T> extends Node<T> {
    Node<T> head;
    public Integer size;

    public SinglyLinkedList() {
        super();
        head = null;
        size = 0;
    }

    public void insertAtTail(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public void insertAtHead(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertAt(Integer index, T data) {

        Node<T> newNode = new Node<>(data);
        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            insertAtHead(data);
        }

        Node<T> temp = head;
        int s = 0;
        while (s < index) {
            temp = temp.next;
            s++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;

    }

    public void displayAllNodes() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            sb.append(current.data.toString());
            if (current.next != null) {
                sb.append("\n");
            }
            current = current.next;
        }
        System.out.println(sb.toString());
    }

    public Boolean deleteIf(Predicate<T> condition) {
        if (head == null)
            return false;

        boolean deleted = false;

        // Handle head separately
        while (head != null && condition.test(head.data)) {
            head = head.next;
            size--;
            deleted = true;
        }

        if (head == null)
            return deleted;

        Node<T> prev = head;
        Node<T> curr = head.next;

        while (curr != null) {
            if (condition.test(curr.data)) {
                prev.next = curr.next;
                size--;
                deleted = true;
                curr = prev.next; // important: don't move prev
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
}
