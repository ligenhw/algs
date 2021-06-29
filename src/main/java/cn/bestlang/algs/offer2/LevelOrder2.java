package cn.bestlang.algs.offer2;

import cn.bestlang.algs.offer2.common.TreeNode;

import java.util.*;

public class LevelOrder2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        addNode(queue, root);
        levelOrder(queue, list);

        return list;
    }

    private void levelOrder(Queue<TreeNode> queue, List<List<Integer>> list) {
        Queue<TreeNode> nextLevel = new LinkedList<>();
        List<Integer> subList = new ArrayList<>();
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            subList.add(node.val);
            addNode(nextLevel, node.left);
            addNode(nextLevel, node.right);
        }
        if (!subList.isEmpty()) {
            list.add(subList);
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
