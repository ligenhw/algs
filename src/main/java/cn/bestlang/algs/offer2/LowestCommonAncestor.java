package cn.bestlang.algs.offer2;

import cn.bestlang.algs.offer2.common.TreeNode;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return dfsLast(root, p, q);
    }

    private TreeNode dfsFirst(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) {
            return null;
        }

        if (p.val <= node.val && q.val >= node.val ||
                (q.val <= node.val && p.val >= node.val)) {
            return node;
        } else if (node.val >= p.val && node.val >= q.val) {
            return dfsFirst(node.left, p, q);
        } else {
            return dfsFirst(node.right, p, q);
        }
    }

    private TreeNode dfsLast(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) {
            return null;
        }

        if (p.val <= node.val && q.val <= node.val) {
            return dfsLast(node.left, p, q);
        } else if (p.val >= node.val && q.val >= node.val) {
            return dfsLast(node.right, p, q);
        } else {
            return node;
        }
    }
}
