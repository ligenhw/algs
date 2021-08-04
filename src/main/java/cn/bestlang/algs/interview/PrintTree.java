package cn.bestlang.algs.interview;

import java.util.LinkedList;
import java.util.Queue;

public class PrintTree {

    private static class Node {
        private int val;
        private Node left;
        private Node right;
    }

    public void printTree(Node root) {
        if (root == null) {
            return ;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }
}
