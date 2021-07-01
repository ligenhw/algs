package cn.bestlang.algs.offer2;

public class TreeToDoublyList {
    static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    public Node treeToDoublyList(Node root) {
        return recur(root);
    }

    private Node recur(Node node) {
        if (node == null) {
            return null;
        }

        boolean leaf = node.left == null && node.right == null;
        if (leaf) {
            return singleNodeToList(node);
        }

        Node leftList = recur(node.left);
        Node rightList = recur(node.right);
        return unionList(unionList(leftList, singleNodeToList(node)), rightList);
    }

    private Node singleNodeToList(Node node) {
        node.right = node;
        node.left = node;

        return node;
    }

    private Node unionList(Node l1, Node l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        Node last1 = l1.left;
        Node last2 = l2.left;

        last1.right = l2;
        l2.left = last1;

        l1.left = last2;
        last2.right = l1;

        return l1;
    }
}
