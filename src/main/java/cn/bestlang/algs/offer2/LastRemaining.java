package cn.bestlang.algs.offer2;

public class LastRemaining {
    private static class Node {
        int val;
        Node next;

        public Node(int v) {
            val = v;
        }
    }

    public int lastRemaining(int n, int m) {
        Node dummyNode = new Node(0);
        Node preNode = dummyNode;
        for (int i = 0; i < n; i++) {
            preNode.next = new Node(i);
            preNode = preNode.next;
        }
        preNode.next = dummyNode.next;

        int size = n;
        Node node = dummyNode.next;
        Node pre = preNode;
        while (size > 1) {
            int c = 0;
            if (m > size) {
                c = m % size;
            } else {
                c = m;
            }
            while (c > 1) {
                pre = node;
                node = node.next;
                c--;
            }

            pre.next = node.next;
            node = node.next;
            size--;
        }

        return pre.next.val;
    }
}
