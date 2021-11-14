package stack;

class Node {
    Node next;
    int data;

    public Node(int data) {
        this.next = null;
        this.data = data;
    }
}

class StackDemo {
    Node head;

    void push(int data) {
        Node node = new Node(data);
        if (this.head != null) {
            node.next = this.head;
        }
        this.head = node;
    }

    int pop() {
        if (this.head == null) {
            System.out.println("UNDERFLOW");
            return -1;
        }
        int data = this.head.data;
        this.head = this.head.next;
        return data;
    }

    boolean isEmpty() {
        return this.head == null;
    }

    int peek() {
        if (this.head == null) {
            System.out.println("UNDERFLOW");
            return -1;
        }
        return this.head.data;
    }
}

public class StackWithListDemo {
    public static void main(String[] args) {
        StackDemo demo = new StackDemo();

        System.out.println(demo.isEmpty());

        demo.push(5);
        demo.push(9);
        demo.push(3);

        System.out.println(demo.pop());
        System.out.println(demo.peek());
        System.out.println(demo.isEmpty());
    }
}
