package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.ListNode;

public class ReverseList {
    public ListNode reverseList(ListNode head) {

        return reverseListRecursion(head);
    }

    private ListNode reverseListIteration(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode current = head;
        ListNode next = current.next;
        head.next = null;

        while (next != null) {
            ListNode t = next.next;
            next.next = current;

            current = next;
            next = t;
        }
        return current;
    }

    private ListNode reverseListRecursion(ListNode head) {
        ListNode recursion = recursion(head);
        if (head != null) {
            head.next = null;
        }
        return recursion;
    }

    private ListNode recursion(ListNode node) {
        if (node == null) {
            return null;
        }

        ListNode next = node.next;
        if (next != null) {
            ListNode recursion = recursion(next);
            next.next = node;
            return recursion;
        } else {
            return node;
        }
    }
}
