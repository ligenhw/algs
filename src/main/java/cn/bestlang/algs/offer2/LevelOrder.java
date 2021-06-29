package cn.bestlang.algs.offer2;

import cn.bestlang.algs.offer2.common.TreeNode;

import java.util.*;

public class LevelOrder {
    public int[] levelOrder(TreeNode root) {
        InnerList list = new InnerList();
        Queue<TreeNode> queue = new LinkedList<>();
        addNode(queue, root);
        levelOrder(queue, list);

        return list.toArray();
    }

    private static class InnerList {
        private int[] data = new int[4];
        private int i;

        public void add(int element) {
            if (i == data.length) {
                data = Arrays.copyOf(data, data.length * 2);
            }

            data[i++] = element;
        }

        public int[] toArray() {
            return Arrays.copyOf(data, i);
        }
    }

    private void levelOrder(Queue<TreeNode> queue, InnerList list) {
        Queue<TreeNode> nextLevel = new LinkedList<>();
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            addNode(nextLevel, node.left);
            addNode(nextLevel, node.right);
        }

        if (!nextLevel.isEmpty()) {
            levelOrder(nextLevel, list);
        }
    }

    private void addNode(Queue<TreeNode> queue, TreeNode node) {
        if (node != null) {
            queue.add(node);
        }
    }
}
