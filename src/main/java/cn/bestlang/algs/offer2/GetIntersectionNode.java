package cn.bestlang.algs.offer2;

import cn.bestlang.algs.offer2.common.ListNode;

import java.util.HashSet;
import java.util.Set;

public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> sets = new HashSet<>();
        while (headA != null) {
            sets.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (sets.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
