package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.ListNode;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);

        ListNode c = dummyNode;
        ListNode c1 = l1;
        ListNode c2 = l2;
        while (c1 != null && c2 != null) {
            if (c1.val < c2.val) {
                c.next = c1;
                c1 = c1.next;
            } else {
                c.next = c2;
                c2 = c2.next;
            }
            c = c.next;
        }

        if (c1 == null) {
            c.next = c2;
        } else {
            c.next = c1;
        }

        return dummyNode.next;
    }
}
