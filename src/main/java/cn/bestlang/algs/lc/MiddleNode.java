package cn.bestlang.algs.lc;

import cn.bestlang.algs.common.ListNode;

public class MiddleNode {

    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode p1 = head;
        ListNode p2 = head;
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
            if (p2.next == null) {
                break;
            }
            p2 = p2.next;
        }

        return p1;
    }
}
