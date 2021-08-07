package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.TreeNode;

public class IsValidBST {

    private Integer val;

    public boolean isValidBST(TreeNode root) {
        return dfs(root);
    }

    private boolean dfs(TreeNode node) {
        if (node == null) {
            return true;
        }

        if (!dfs(node.left)) {
            return false;
        }

        if (val != null && node.val <= val) {
            return false;
        }
        val = node.val;
        boolean rightValid = dfs(node.right);

        return rightValid;
    }
}
