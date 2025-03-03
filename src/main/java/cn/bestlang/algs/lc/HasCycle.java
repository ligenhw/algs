package cn.bestlang.algs.lc;

import cn.bestlang.algs.common.ListNode;

public class HasCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode p1 = head;
        ListNode p2 = head;
        while (p2.next != null) {
            p1 = p1.next;

            p2 = p2.next;
            if (p2.next != null) {
                p2 = p2.next;
            }

            if (p1 == p2) {
                return true;
            }
        }

        return false;
    }

}
