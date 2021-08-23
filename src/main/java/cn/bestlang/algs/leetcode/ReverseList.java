package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.ListNode;

public class ReverseList {
    public ListNode reverseList(ListNode head) {

        return reverseListRecursion(head);
    }

    private ListNode reverseListIteration(ListNode head) {
        ListNode pre = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = pre;

            pre = current;
            current = next;
        }

        return pre;
    }

    private ListNode reverseListRecursion(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        ListNode recursion = reverseListRecursion(node.next);
        node.next.next = node;
        node.next = null;

        return recursion;
    }

}
