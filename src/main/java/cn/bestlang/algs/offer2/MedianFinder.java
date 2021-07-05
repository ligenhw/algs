package cn.bestlang.algs.offer2;

public class MedianFinder {

    private static class Node {
        private int val;
        private Node left;
        private Node right;
        private int size;

        public Node(int v) {
            val = v;
        }

        public Node(int v, int s) {
            val = v;
            size = s;
        }
    }

    private Node root;

    /** initialize your data structure here. */
    public MedianFinder() {

    }

    public void addNum(int num) {
        root = addNum(num, root);
    }

    private Node addNum(int num, Node node) {
        if (node == null) {
            return new Node(num, 1);
        }

        if (num < node.val) node.left = addNum(num, node.left);
        else node.right = addNum(num, node.right);

        node.size = size(node.left) + size(node.right) + 1;
        return node;
    }

    public double findMedian() {
        if (root == null) {
            return 0d;
        }

        if (root.size % 2 == 1) {
            return select(root.size / 2);
        } else {
            int s1 = select(root.size / 2);
            int s2 = select(root.size / 2 - 1);
            return (s1 + s2) / 2.0;
        }
    }

    private int select(int k) {
        return select(k, root).val;
    }

    private Node select(int k, Node node) {
        if (node == null) {
            return null;
        }

        int t = size(node.left);
        if (k < t) return select(k, node.left);
        else if (k > t) return select(k - t - 1, node.right);
        else return node;
    }

    private int size(Node node) {
        return node == null ? 0 : node.size;
    }
}
