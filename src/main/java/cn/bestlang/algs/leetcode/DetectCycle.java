package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.ListNode;

public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        ListNode union = null;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                union = slow;
                break;
            }

            slow = slow.next;
            fast = fast.next.next;
        }
        if (union == null) {
            return null;
        }

        int count = 1;
        slow = slow.next;
        fast = fast.next.next;
        while (slow != fast) {
            count++;
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode first = head;
        ListNode second = head;
        for (int i = 0; i < count; i++) {
            second = second.next;
        }

        while (first != second) {
            first = first.next;
            second = second.next;
        }

        return first;
    }
}
