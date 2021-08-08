package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.TreeNode;

public class Flatten {

    private TreeNode preNode;

    public void flatten(TreeNode root) {
        dfs(root);
        TreeNode node = root;
        while (node != null) {
            node.right = node.left;
            node.left = null;
            node = node.right;
        }
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }

        if (preNode != null) {
            preNode.left = node;
        }
        preNode = node;

        dfs(node.left);
        dfs(node.right);
        node.right = null;
    }
}
