package cn.bestlang.algs.offer2;

public class MergeTwoLists {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode last = dummyNode;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                last.next = new ListNode(l2.val);
                l2 = l2.next;
            } else if (l2 == null) {
                last.next = new ListNode(l1.val);
                l1 = l1.next;
            } else if (l1.val < l2.val) {
                last.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                last.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            last = last.next;
        }

        return dummyNode.next;
    }
}
