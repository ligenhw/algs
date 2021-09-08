package cn.bestlang.algs.offer2review;

import cn.bestlang.algs.common.ListNode;

public class ReversePrint {

    public int[] reversePrint(ListNode head) {
        int count = 0;
        ListNode node = head;
        while (node != null) {
            count++;
            node = node.next;
        }

        int[] result = new int[count];
        node = head;
        int i = count - 1;
        while (node != null) {
            result[i--] = node.val;
            node = node.next;
        }

        return result;
    }
}
