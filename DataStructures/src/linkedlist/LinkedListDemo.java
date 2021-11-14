package linkedlist;


class Node {
    int data;
    Node next;
//    Node previous;

    Node(int data) {
        this.data = data;
        this.next = null;
//        this.previous = null;
    }
}

class LinkedList {
    Node head;
//    Node tail;

    void pushBack(int data) {
        Node node = new Node(data);
        if (this.head != null) {
            node.next = this.head;
        }
        this.head = node;
    }

    void pushFront(int data) {
        Node node = new Node(data);

        if (this.head == null) {
            this.head = node;
        } else {
            Node tmp = this.head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = node;
        }
    }

    void insert(int data, int index) {
        Node node = new Node(data);
        if (index == 1) {
            node.next = this.head;
            this.head = node;
        } else {
            Node tmp = this.head;
            for (int i = 2; i < index && tmp != null; ++i) {
                tmp = tmp.next;
            }
            node.next = tmp.next;
            tmp.next = node;
        }
    }

    int getSize() {
        int size = 0;
        Node tmp = this.head;
        while (tmp != null) {
            tmp = tmp.next;
            ++size;
        }
        return size;
    }

    void display() {
        Node tmp = this.head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList demo = new LinkedList();
        demo.pushBack(5);
        demo.pushBack(10);
        demo.pushBack(15);
        demo.pushFront(20);
        demo.pushFront(25);
        demo.insert(40, 3);
        demo.display();
        System.out.println("Size = " + demo.getSize());
    }
}
