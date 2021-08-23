package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetIntersectionNodeTest {

    @Test
    void getIntersectionNode() {
        ListNode headA = new ListNode(1);
        ListNode headB = new ListNode(2);
        headB.next = headA;

        ListNode intersectionNode = new GetIntersectionNode().getIntersectionNode(headA, headB);
        System.out.println(intersectionNode.val);
    }
}