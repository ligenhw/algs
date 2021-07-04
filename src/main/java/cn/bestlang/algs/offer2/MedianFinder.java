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
    }

    private Node root;

    /** initialize your data structure here. */
    public MedianFinder() {

    }

    public void addNum(int num) {
        if (root == null) {
            root = new Node(num);
        }
    }

    private void addNum(int num, Node node) {
        if (num < node.val) {

        }
    }

    public double findMedian() {

        return 0d;
    }
}
