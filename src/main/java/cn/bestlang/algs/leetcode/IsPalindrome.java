package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }

        Deque<Integer> stack = new LinkedList<>();
        ListNode node = head;
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }

        node = head;
        while (node != null) {
            Integer pop = stack.pop();
            if (!pop.equals(node.val)) {
                return false;
            }

            node = node.next;
        }

        return true;
    }
}
