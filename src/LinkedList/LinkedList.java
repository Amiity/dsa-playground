package LinkedList;

public class LinkedList {

    Node head;

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        list.getAll();


    }

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
