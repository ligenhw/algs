package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.ListNode;

public class ReverseList2 {
    public ListNode reverseList(ListNode head) {
        return reverseListIteration(head);
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
        if (node.next == null) {
            return node;
        }

        ListNode next = reverseListRecur(node.next);
        next.next = node;
        return node;
    }
}
