class LinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    Node head;
    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    void insertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void deleteBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Deleted from beginning: " + head.data);
        head = head.next;
    }
    void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            System.out.println("Deleted from end: " + head.data);
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        System.out.println("Deleted from end: " + current.next.data);
        current.next = null;
    }
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertBeginning(5);
        list.display();
        list.deleteBeginning();
        list.display();
        list.deleteEnd();
        list.display();
    }
}