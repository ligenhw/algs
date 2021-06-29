package cn.bestlang.algs.offer2;

public class ReverseList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        ListNode current = head;
        while(current != null) {
            ListNode t = current.next;
            current.next = preNode;
            preNode = current;
            current = t;
        }

        return preNode;
    }
}
