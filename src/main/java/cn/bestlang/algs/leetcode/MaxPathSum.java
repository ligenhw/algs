package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.TreeNode;

public class MaxPathSum {

    private Integer max;

    public int maxPathSum(TreeNode root) {
        TreeNodeMax treeNodeMax = new TreeNodeMax(root, 0, null, null);
        dfs(treeNodeMax);

        firstDfs(treeNodeMax);

        return max;
    }

    private void firstDfs(TreeNodeMax treeNodeMax) {
        if (treeNodeMax.node == null) {
            return;
        }

        TreeNode node = treeNodeMax.node;
        int subMax = node.val;
        if (treeNodeMax.left.max > 0) {
            subMax += treeNodeMax.left.max;
        }
        if (treeNodeMax.right.max > 0) {
            subMax += treeNodeMax.right.max;
        }

        if (max == null) {
            max = subMax;
        } else {
            max = Math.max(max, subMax);
        }

        firstDfs(treeNodeMax.left);
        firstDfs(treeNodeMax.right);
    }

    private void dfs(TreeNodeMax treeNodeMax) {
        if (treeNodeMax.node == null) {
            return;
        }

        TreeNode node = treeNodeMax.node;

        TreeNodeMax left = new TreeNodeMax(node.left, 0, null, null);
        treeNodeMax.left = left;
        dfs(left);

        TreeNodeMax right = new TreeNodeMax(node.right, 0, null, null);
        treeNodeMax.right = right;
        dfs(right);

        treeNodeMax.max =  Math.max(0, Math.max(left.max, right.max)) + node.val;
    }

    private static class TreeNodeMax {
        TreeNode node;
        int max;
        TreeNodeMax left;
        TreeNodeMax right;

        public TreeNodeMax(TreeNode node, int max, TreeNodeMax left, TreeNodeMax right) {
            this.node = node;
            this.max = max;
            this.left = left;
            this.right = right;
        }
    }
}
