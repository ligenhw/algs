package cn.bestlang.algs.offer2;

import cn.bestlang.algs.common.ListNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReversePrintTest {

    private ListNode toListNode(int[] head) {
        ListNode root = new ListNode(head[0]);
        ListNode node = root;
        for (int i = 1; i < head.length; i++) {
            node.next = new ListNode(head[i]);
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