package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.ListNode;

public class ReverseBetween {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode node = head;
        ListNode pre = null;
        int i = 1;
        int size = right - left;

        while (i < left) {
            node = node.next;
            pre = node;
            i++;
        }

        ListNode subHead = node;
        ListNode subPre = null;
        while (size > 0) {
            ListNode next = node.next;
            node.next = subPre;
            subPre = node;
            node = next;
            size--;
        }
        pre.next = subPre;
        subHead.next = node;

        return head;
    }
}
