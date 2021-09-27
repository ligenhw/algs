package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.ListNode;

public class ReverseList2 {
    public ListNode reverseList(ListNode head) {
        return reverseListRecur(head);
    }

    public ListNode reverseListIteration(ListNode head) {
        ListNode node = head;
        ListNode pre = null;

        while (node != null) {
            ListNode next = node.next;
            node.next = pre;
            pre = node;

            node = next;
        }
        return pre;
    }

    public ListNode reverseListRecur(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        ListNode next = reverseListRecur(node.next);
        node.next.next = node;
        node.next = null;
        return next;
    }
}
