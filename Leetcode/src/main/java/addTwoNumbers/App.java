package addTwoNumbers;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);


        ListNode l = addTwoNumbers(l1, l2);
        print(l);

    }

    public static void print(ListNode listNode) {
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode head = listNode;
        int balance = 0;
        while (l1 != null && l2 != null) {
            int number = l1.val + l2.val;
            System.out.println("number " + number);
            if (balance > 0) {
                number = number + balance;
                balance = 0;
            }
            if (number > 9) {
                balance = number / 10;
                number = number % 10;
            }
            listNode.next = new ListNode(number);
            listNode = listNode.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int number = l1.val + balance;
            if (number > 9) {
                number = number % 10;
                balance = number / 10;
            } else {
                balance = 0;
            }
            listNode.next = new ListNode(number);
            listNode = listNode.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int number = l2.val + balance;
            if (number > 9) {
                number = number % 10;
                balance = number / 10;
            } else {
                balance = 0;
            }
            listNode.next = new ListNode(number);
            listNode = listNode.next;
            l2 = l2.next;
        }
        return head.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
