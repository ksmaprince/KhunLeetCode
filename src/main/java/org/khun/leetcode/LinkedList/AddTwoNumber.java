package org.khun.leetcode.LinkedList;

public class AddTwoNumber {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode currentNode = head;
        int d = 0;
        while (l1 != null && l2 != null) {
            if (l1 == null) l1.val = 0;
            if (l2 == null) l2.val = 0;
            int r = (d + l1.val + l2.val) % 10;
            d = (d + l1.val + l2.val) / 10;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            currentNode.next = new ListNode(r);
            currentNode = currentNode.next;
        }
        return head.next;
    }


    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
