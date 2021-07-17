package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.ListNode;

public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode pre = null;
        ListNode last = null;
        ListNode node = dummyNode;
        int count = 0;
        while (node != null) {
            if (count == 0) {
                pre = node;

            } else if (count == k) {
                ListNode next = node.next;
                last = node;
                ListNode reverse = reverse(pre, last);
                reverse.next = next;
                pre = reverse;
                node = pre;
                count = 0;
            }
            node = node.next;
            count++;
        }
        return dummyNode.next;
    }

    private ListNode reverse(ListNode pre, ListNode last) {
        ListNode newLast = pre.next;
        ListNode node = pre.next;
        pre.next = last;
        while(node != last) {
            ListNode next = node.next;
            node.next = pre;

            pre = node;
            node = next;
        }
        node.next = pre;
        return newLast;
    }
}
