package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Deque<ListNode> nodeStackA = addStack(headA);
        Deque<ListNode> nodeStackB = addStack(headB);

        ListNode joinNode = null;
        while (!nodeStackA.isEmpty() && !nodeStackB.isEmpty()) {
            ListNode nodeA = nodeStackA.pop();
            ListNode nodeB = nodeStackB.pop();
            if (nodeA == nodeB) {
                joinNode = nodeA;
            } else {
                break;
            }
        }

        return joinNode;
    }

    private Deque<ListNode> addStack(ListNode headA) {

        Deque<ListNode> nodeStack = new LinkedList<>();
        ListNode node = headA;
        while (node != null) {
            nodeStack.push(node);
            node = node.next;
        }

        return nodeStack;
    }
}
