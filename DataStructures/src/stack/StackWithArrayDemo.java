package stack;


class Stack {
    int[] arr;
    int top;

    Stack() {
        arr = new int[100];
        top = -1;
    }

    void push(int num) {
        if(top == arr.length - 1) {
            System.out.println("OVERFLOW");
        } else {
            arr[++top] = num;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("UNDERFLOW");
            return -1;
        }
        return arr[top--];
    }

    boolean isEmpty() {
        return top == -1;
    }

    int peek() {
        if (top == -1) {
            return -1;
        }
        return arr[top];
    }
}

public class StackWithArrayDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println(stack.pop());

        stack.push(6);
        stack.push(5);
        stack.push(9);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
    }
}
