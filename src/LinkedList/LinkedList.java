package LinkedList;

public class LinkedList {

    Node head;

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        /* Addition to linkedlist */
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        list.addFirst(4);

        list.addAtIndex(3, 11);

        list.getAll();

        System.out.println("""
                                
                Now performing deletion experiments
                """);

        /* deletion to linkedlist */

        list.deleteFirst();
        list.deleteAtEnd();

        list.getAll();

        System.out.println("""
                                
                Now performing deletion At Index
                """);

        list.deleteAtIndex(2);
        list.getAll();

        System.out.println("\nNo performing deletion using data");

        list.add(2);
        list.add(6);
        list.add(5);
        list.add(5);
        list.add(8);
        list.getAll();

        list.deleteByValue(5);

        list.getAll();


    }

    private void deleteByValue(int data) {

        // condition to check first or multiple occurence at the start
        while (head != null && head.data == data) {
            head = head.next;
        }

        Node previous = null;
        Node current = head;


        while (current != null) {
            if (current.data == data) {
                previous.next = current.next;
                current = current.next;
            } else {
                previous = current;
                current = current.next;
            }
        }
    }

    private void deleteAtIndex(int index) {

        if (index < 0 || head == null) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        int count = 0;
        Node previous = null;
        Node current = head;
        while (current != null && count < index) {
            previous = current;
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Index out of bounds");
            return;
        }
        previous.next = current.next;
    }

    private void deleteAtEnd() {
        Node current = head;
        Node previous = head;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
    }

    private void deleteFirst() {
        if (head != null) {
            head = head.next;
        }
    }


    // Add at the index
    private void addAtIndex(int index, int data) {
        Node node = new Node(data);

        if (index < 0) {
            System.out.println("Invalid Index");
        }

        int count = 0;
        Node current = head;
        Node previous = null;
        while (current != null & count < index) {
            previous = current;
            current = current.next;
            count++;
        }

        if (previous == null) {
            node.next = head;
            head = node;
        } else {
            previous.next = node;
            node.next = current;
        }
    }


    // Add at the end
    public void add(int data) {
        Node node = new Node(data);
        if (head != null) {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        } else {
            head = node;
        }
    }


    // Add at the beginning
    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void getAll() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
