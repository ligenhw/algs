package cn.bestlang.algs.offer2;

import cn.bestlang.algs.offer2.common.TreeNode;

public class KthLargest {

    int k;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        TreeNode node = dfs(root);
        return node.val;
    }

    private TreeNode dfs(TreeNode node) {
        if (node == null) {
            return null;
        }

        TreeNode right = dfs(node.right);
        if (right != null) return right;

        if (--k == 0) return node;

        TreeNode left = dfs(node.left);
        if (left != null) return left;

        return null;
    }
}
