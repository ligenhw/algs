package cn.bestlang.algs.leetcode;

import cn.bestlang.algs.common.TreeNode;

public class MergeTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        TreeNode root = merge(root1, null);
        TreeNode mergeTree = merge(root2, root);
        return mergeTree;
    }

    private TreeNode merge(TreeNode tree, TreeNode node) {
        if (tree == null) {
            return node;
        }

        if (node == null) {
            node = new TreeNode(0);
        }
        node.val += tree.val;

        node.left = merge(tree.left, node.left);
        node.right = merge(tree.right, node.right);
        return node;
    }
}
