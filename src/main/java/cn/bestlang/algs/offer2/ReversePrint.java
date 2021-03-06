package cn.bestlang.algs.offer2;

import cn.bestlang.algs.common.ListNode;

public class ReversePrint {

    public int[] reversePrint(ListNode head) {
        ListNode node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }

        int[] result = new int[length];
        int i = length - 1;
        node = head;
        while(node != null) {
            result[i--] = node.val;
            node = node.next;
        }

        return result;
    }

    public void reversePrint2(ListNode node) {
        if (node == null) {
            return;
        }

        reversePrint2(node.next);
        System.out.println(node.val);
    }


}
