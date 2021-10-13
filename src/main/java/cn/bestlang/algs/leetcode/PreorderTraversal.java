package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrder2(result, root);

        return result;
    }

    private void preOrder(List<Integer> result, TreeNode node) {
        if (node == null) {
            return;
        }

        result.add(node.val);

        preOrder(result, node.left);
        preOrder(result, node.right);
    }

    private void preOrder2(List<Integer> result, TreeNode node) {
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode cur = node;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                result.add(cur.val);

                stack.push(cur);
                cur = cur.left;
            }

            cur = stack.pop();
            cur = cur.right;
        }
    }
}
