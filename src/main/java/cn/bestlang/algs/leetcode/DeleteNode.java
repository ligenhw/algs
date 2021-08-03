package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.ListNode;

public class DeleteNode {
    public void deleteNode(ListNode node) {
        ListNode pre = node;
        ListNode current = node.next;
        while (current != null) {
            pre.val = current.val;
            if (current.next == null) {
                pre.next = null;
                break;
            }
            pre = current;
            current = current.next;
        }
    }
}
