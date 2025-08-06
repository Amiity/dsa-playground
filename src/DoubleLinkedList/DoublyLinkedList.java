package DoubleLinkedList;

import java.awt.dnd.DragSource;

class Node {

    Node previous;
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
    }


}

public class DoublyLinkedList {
    Node head;
    Node tail;

    public static void main(String[] args) {

        DoublyLinkedList linkedList = new DoublyLinkedList();

        linkedList.addFirst(2);
        linkedList.addFirst(4);

        linkedList.traverse();

        linkedList.addLast(3);
        linkedList.addLast(5);

        linkedList.traverse();

        linkedList.traverseEnd();

        linkedList.addAtIndex(2, 7);

        linkedList.traverse();

        linkedList.deleteAtEnd();

        linkedList.traverse();

        linkedList.deleteAtIndex(2);

        linkedList.traverse();

        linkedList.reverse();

        linkedList.traverse();

    }

    private void reverse() {

        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            head = tail;
            tail = temp;
        }
    }

    private void deleteAtIndex(int index) {

        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.previous = null;
            } else {
                tail = null;
            }
            return;
        }

        int count = 0;
        Node current = head;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            System.out.println("Index out of bound");
            return;
        }
        if (current.next == tail) {
            tail = current;
        }
        current.next = current.next.next;
        if (current.next != null) {
            current.next.previous = current;
        }
    }

    private void deleteAtEnd() {

        if (head == null) {
            System.out.println("nothing to delete");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;

    }

    private void addAtIndex(int index, int data) {

        Node node = new Node(data);
        if (index == 0) {
            node.next = head;
            if (head != null) {
                head.previous = node;
            }
            head = node;
            return;
        }

        int count = 0;
        Node current = head;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Index out of bound");
        }

        node.next = current.next;
        node.previous = current;

        if (current.next != null) {
            current.next.previous = node;
        } else {
            tail = node;
        }
        current.next = node;
    }

    private void traverseEnd() {

        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.previous;
        }
        System.out.println();
    }

    private void addLast(int data) {

        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
            node.previous = current;
            tail = node;
        }

    }

    private void traverse() {

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    private void addFirst(int data) {

        Node node = new Node(data);

        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.previous = node;
            head = node;
        }
    }
}
