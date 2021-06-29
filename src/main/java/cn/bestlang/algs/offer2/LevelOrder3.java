package cn.bestlang.algs.offer2;

import cn.bestlang.algs.offer2.common.TreeNode;

import java.util.*;

public class LevelOrder3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.add(root);
        boolean order = true;

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> subList = new ArrayList<>();
            Deque<Integer> subStack = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                if (order) {
                    subList.add(node.val);
                } else {
                    subStack.push(node.val);
                }
            }
            if (!order) {
                while(!subStack.isEmpty()) {
                    subList.add(subStack.pop());
                }
            }
            list.add(subList);
            order = !order;
        }

        return list;
    }

}
