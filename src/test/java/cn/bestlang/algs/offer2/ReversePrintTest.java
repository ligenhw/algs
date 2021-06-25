package cn.bestlang.algs.offer2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReversePrintTest {

    private ReversePrint.ListNode toListNode(int[] head) {
        ReversePrint.ListNode root = new ReversePrint.ListNode(head[0]);
        ReversePrint.ListNode node = root;
        for (int i = 1; i < head.length; i++) {
            node.next = new ReversePrint.ListNode(head[i]);
            node = node.next;
        }

        return root;
    }

    @Test
    void reversePrint() {
        int[] head = {1,3,2};
        int[] expect = {2, 3, 1};
        assertTrue(Arrays.equals(expect, new ReversePrint().reversePrint(toListNode(head))));
    }

    @Test
    void reversePrint2() {
        int[] head = {1,3,2};
        new ReversePrint().reversePrint2(toListNode(head));
    }
}