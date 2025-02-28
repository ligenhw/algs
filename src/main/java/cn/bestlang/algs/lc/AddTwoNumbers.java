package cn.bestlang.algs.lc;

import cn.bestlang.algs.common.ListNode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1 = l1;
        ListNode n2 = l2;
        ListNode head = new ListNode();
        ListNode current = head;

        boolean add = false;
        while (n1 != null || n2 != null) {
            int val = 0;
            if (n1 != null) {
                val += n1.val;
                n1 = n1.next;
            }
            if (n2 != null) {
                val += n2.val;
                n2 = n2.next;
            }
            if (add) {
                val += 1;
                add = false;
            }

            if (val >= 10) {
                add = true;
                val -= 10;
            }

            ListNode node = new ListNode(val);
            current.next = node;
            current = node;
        }

        if (add) {
            current.next = new ListNode(1);
        }

        return head.next;
    }

}
