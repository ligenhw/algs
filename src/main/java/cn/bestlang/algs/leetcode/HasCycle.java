package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.ListNode;

public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }
}
