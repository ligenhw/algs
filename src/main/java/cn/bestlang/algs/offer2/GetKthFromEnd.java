package cn.bestlang.algs.offer2;

public class GetKthFromEnd {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode first = head;
        int i = 0;
        for (i = 0; i < k && first != null; i++) {
            first = first.next;
        }
        if (i != k) {
            return null;
        }
        ListNode second = head;
        while(first != null) {
            first = first.next;
            second = second.next;
        }

        return second;
    }
}
