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

        list.deleteAtIndex(3);

        list.getAll();


    }

    private void deleteAtIndex(int index) {
        int count = 1;
        Node previous = head;
        Node current = head;
        while(count < index){
            previous = current;
            current = current.next;
            count++;
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

        int count = 1;
        Node current = head;
        Node previous = head;
        while (count < index) {
            previous = current;
            current = current.next;
            count++;
        }
        previous.next = node;
        node.next = current;
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
    }
}

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
